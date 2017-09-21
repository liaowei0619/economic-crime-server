package com.louis.service;

import com.louis.entity.Operations;
import com.louis.mapper.OperationsMapper;
import com.louis.repository.OperationRespository;
import com.louis.utilTools.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liaowei
 * @create 2017-09-21 10:28
 * @desc
 **/
@Service(OperationServiceImpl.SERVICE_NAME)
public class OperationServiceImpl implements OperationService {
	public static final String SERVICE_NAME = "com.louis.service.OperationServiceImpl";
	
	
	@Autowired
	private OperationsMapper operationsMapper;
	
	@Autowired
	private OperationRespository operationRespository;
	
	public Operations addOPerations(Operations operations) {
		operations.setId(UUIDUtils.getUUID());
		return operationRespository.save(operations);
	}
}
