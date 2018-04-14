package com.baidu.ms.mapper;

import com.baidu.ms.pojo.SmsMessage;
import com.baidu.ms.pojo.SmsMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsMessageMapper {
    long countByExample(SmsMessageExample example);

    int deleteByExample(SmsMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsMessage record);

    int insertSelective(SmsMessage record);

    List<SmsMessage> selectByExample(SmsMessageExample example);

    SmsMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsMessage record, @Param("example") SmsMessageExample example);

    int updateByExample(@Param("record") SmsMessage record, @Param("example") SmsMessageExample example);

    int updateByPrimaryKeySelective(SmsMessage record);

    int updateByPrimaryKey(SmsMessage record);
}