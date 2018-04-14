package com.baidu.ms.mapper;

import com.baidu.ms.pojo.PayConfig;
import com.baidu.ms.pojo.PayConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayConfigMapper {
    long countByExample(PayConfigExample example);

    int deleteByExample(PayConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayConfig record);

    int insertSelective(PayConfig record);

    List<PayConfig> selectByExample(PayConfigExample example);

    PayConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayConfig record, @Param("example") PayConfigExample example);

    int updateByExample(@Param("record") PayConfig record, @Param("example") PayConfigExample example);

    int updateByPrimaryKeySelective(PayConfig record);

    int updateByPrimaryKey(PayConfig record);
}