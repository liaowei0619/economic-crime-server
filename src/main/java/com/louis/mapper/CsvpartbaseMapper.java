package com.louis.mapper;

import com.louis.entity.Csvpartbase;
import com.louis.entity.CsvpartbaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CsvpartbaseMapper {
    int countByExample(CsvpartbaseExample example);

    int deleteByExample(CsvpartbaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(Csvpartbase record);

    int insertSelective(Csvpartbase record);

    List<Csvpartbase> selectByExample(CsvpartbaseExample example);

    Csvpartbase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Csvpartbase record, @Param("example") CsvpartbaseExample example);

    int updateByExample(@Param("record") Csvpartbase record, @Param("example") CsvpartbaseExample example);

    int updateByPrimaryKeySelective(Csvpartbase record);

    int updateByPrimaryKey(Csvpartbase record);
    
    /**
     * 查询所有导入的信息
     * @return
     */
    List<Csvpartbase> selectAll();
}