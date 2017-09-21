package com.louis.mapper;

import com.louis.entity.Operations;
import com.louis.entity.OperationsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationsMapper {
    int countByExample(OperationsExample example);

    int deleteByExample(OperationsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Operations record);

    int insertSelective(Operations record);

    List<Operations> selectByExample(OperationsExample example);

    Operations selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Operations record, @Param("example") OperationsExample example);

    int updateByExample(@Param("record") Operations record, @Param("example") OperationsExample example);

    int updateByPrimaryKeySelective(Operations record);

    int updateByPrimaryKey(Operations record);
}