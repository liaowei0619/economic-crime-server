package com.louis.mapper;

import com.louis.entity.FileTb;
import com.louis.entity.FileTbExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileTbMapper {
	int countByExample(FileTbExample example);
	
	int deleteByExample(FileTbExample example);
	
	int deleteByPrimaryKey(String fileId);
	
	int insert(FileTb record);
	
	int insertSelective(FileTb record);
	
	List<FileTb> selectByExample(FileTbExample example);
	
	FileTb selectByPrimaryKey(String fileId);
	
	int updateByExampleSelective(@Param("record") FileTb record, @Param("example") FileTbExample example);
	
	int updateByExample(@Param("record") FileTb record, @Param("example") FileTbExample example);
	
	int updateByPrimaryKeySelective(FileTb record);
	
	int updateByPrimaryKey(FileTb record);
}