package com.louis.aspect;/**
 * Created by Administrator on 2017/8/10.
 */

import com.louis.entity.Operations;
import com.louis.service.OperationService;
import com.louis.service.OperationServiceImpl;
import com.louis.vo.ResponseTemplate;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 拦截访问
 *
 * @author Louis
 * @create_date 2017-08-10 15:41
 **/
@Aspect
@Component
public class FIlterAspect {
	
	private final static Logger logger = LoggerFactory.getLogger(FIlterAspect.class);
	
	private Operations operationDomain;
	
	@Resource(name = OperationServiceImpl.SERVICE_NAME)
	private OperationService operationServiceImpl;
	
	@Pointcut("execution(public * com.louis.controller.*.*(..))")
	public void log() {
	}
	
	
	@Before("log()")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		
		HttpServletRequest request = attributes.getRequest();
		//url
		logger.info("URL={}", request.getRequestURL());
		//method
		logger.info("method={}", request.getMethod());
		//类方法
		logger.info("class_method={}", joinPoint.getSignature().getDeclaringType().getName());
		//参数
		logger.info("args={}", joinPoint.getArgs());
		//ip
		logger.info("IP={}", request.getRemoteAddr());
		if (operationDomain == null) {
			operationDomain = new Operations();
			setOperation(joinPoint, request);
		} else {
			setOperation(joinPoint, request);
		}
	}
	
	private void setOperation(JoinPoint joinPoint, HttpServletRequest request) {
		operationDomain.setUrl(request.getRequestURL().toString());
		operationDomain.setReqdatetime(new Date());
		operationDomain.setMethod(request.getMethod());
		operationDomain.setClassmethod(joinPoint.getSignature().getDeclaringType().getName());
		operationDomain.setArgs(joinPoint.getArgs().toString());
		operationDomain.setIp(request.getRemoteAddr());
	}
	
	@After("log()")
	public void doAfter() {
		logger.info("操作成功");
	}
	
	@AfterReturning(returning = "object", pointcut = "log()")
	public void afterReturn(Object object) {
		logger.info("response={}", object);
		ResponseTemplate result = (ResponseTemplate) object;
		
		if (!result.isSuccess()) {
			operationDomain.setReqresult((byte) 0);
		}
		synchronized (FIlterAspect.class) {
			operationDomain.setSavedatetime(new Date());
			operationServiceImpl.addOPerations(operationDomain);
		}
	}
}
