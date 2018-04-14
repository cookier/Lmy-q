package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatReplyKeyword;
import com.baidu.ms.pojo.WechatReplyKeywordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatReplyKeywordMapper {
    long countByExample(WechatReplyKeywordExample example);

    int deleteByExample(WechatReplyKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatReplyKeyword record);

    int insertSelective(WechatReplyKeyword record);

    List<WechatReplyKeyword> selectByExample(WechatReplyKeywordExample example);

    WechatReplyKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatReplyKeyword record, @Param("example") WechatReplyKeywordExample example);

    int updateByExample(@Param("record") WechatReplyKeyword record, @Param("example") WechatReplyKeywordExample example);

    int updateByPrimaryKeySelective(WechatReplyKeyword record);

    int updateByPrimaryKey(WechatReplyKeyword record);
}