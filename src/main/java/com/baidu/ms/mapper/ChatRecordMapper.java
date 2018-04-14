package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ChatRecord;
import com.baidu.ms.pojo.ChatRecordExample;
import com.baidu.ms.pojo.ChatRecordWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatRecordMapper {
    long countByExample(ChatRecordExample example);

    int deleteByExample(ChatRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChatRecordWithBLOBs record);

    int insertSelective(ChatRecordWithBLOBs record);

    List<ChatRecordWithBLOBs> selectByExampleWithBLOBs(ChatRecordExample example);

    List<ChatRecord> selectByExample(ChatRecordExample example);

    ChatRecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChatRecordWithBLOBs record, @Param("example") ChatRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ChatRecordWithBLOBs record, @Param("example") ChatRecordExample example);

    int updateByExample(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByPrimaryKeySelective(ChatRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ChatRecordWithBLOBs record);

    int updateByPrimaryKey(ChatRecord record);
}