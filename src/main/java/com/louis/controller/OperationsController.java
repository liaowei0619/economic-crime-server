package com.louis.controller;

import com.louis.config.MYJZConfig;
import com.louis.entity.Operations;
import com.louis.service.OperationService;
import com.louis.service.OperationServiceImpl;
import com.louis.utilTools.UUIDUtils;
import com.louis.vo.ResponseTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liaowei
 * @create 2017-09-21 13:51
 * @desc 操作查询
 **/
@RestController
@RequestMapping(MYJZConfig.API + "/operations")
public class OperationsController {
	
	@Resource(name = OperationServiceImpl.SERVICE_NAME)
	private OperationService operationServiceImpl;
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ResponseTemplate addOPerations() {
		
		Operations o = new Operations();
		o.setId(UUIDUtils.getUUID());
		return new ResponseTemplate(operationServiceImpl.addOPerations(o));
	}
}
