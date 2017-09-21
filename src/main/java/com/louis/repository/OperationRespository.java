package com.louis.repository;

import com.louis.entity.Operations;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liaowei
 * @create 2017-09-21 9:33
 * @desc 操作日志
 **/
public interface OperationRespository extends JpaRepository<Operations, String> {
}
