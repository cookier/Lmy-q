package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataFanstagOrder;
import com.baidu.ms.pojo.DataFanstagOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataFanstagOrderMapper {
    long countByExample(DataFanstagOrderExample example);

    int deleteByExample(DataFanstagOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataFanstagOrder record);

    int insertSelective(DataFanstagOrder record);

    List<DataFanstagOrder> selectByExample(DataFanstagOrderExample example);

    DataFanstagOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataFanstagOrder record, @Param("example") DataFanstagOrderExample example);

    int updateByExample(@Param("record") DataFanstagOrder record, @Param("example") DataFanstagOrderExample example);

    int updateByPrimaryKeySelective(DataFanstagOrder record);

    int updateByPrimaryKey(DataFanstagOrder record);
}