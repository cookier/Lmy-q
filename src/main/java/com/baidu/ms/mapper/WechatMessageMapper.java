package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatMessage;
import com.baidu.ms.pojo.WechatMessageExample;
import com.baidu.ms.pojo.WechatMessageWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatMessageMapper {
    long countByExample(WechatMessageExample example);

    int deleteByExample(WechatMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatMessageWithBLOBs record);

    int insertSelective(WechatMessageWithBLOBs record);

    List<WechatMessageWithBLOBs> selectByExampleWithBLOBs(WechatMessageExample example);

    List<WechatMessage> selectByExample(WechatMessageExample example);

    WechatMessageWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatMessageWithBLOBs record, @Param("example") WechatMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatMessageWithBLOBs record, @Param("example") WechatMessageExample example);

    int updateByExample(@Param("record") WechatMessage record, @Param("example") WechatMessageExample example);

    int updateByPrimaryKeySelective(WechatMessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WechatMessageWithBLOBs record);

    int updateByPrimaryKey(WechatMessage record);
}