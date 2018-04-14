package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatReplyContent;
import com.baidu.ms.pojo.WechatReplyContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatReplyContentMapper {
    long countByExample(WechatReplyContentExample example);

    int deleteByExample(WechatReplyContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatReplyContent record);

    int insertSelective(WechatReplyContent record);

    List<WechatReplyContent> selectByExampleWithBLOBs(WechatReplyContentExample example);

    List<WechatReplyContent> selectByExample(WechatReplyContentExample example);

    WechatReplyContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatReplyContent record, @Param("example") WechatReplyContentExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatReplyContent record, @Param("example") WechatReplyContentExample example);

    int updateByExample(@Param("record") WechatReplyContent record, @Param("example") WechatReplyContentExample example);

    int updateByPrimaryKeySelective(WechatReplyContent record);

    int updateByPrimaryKeyWithBLOBs(WechatReplyContent record);

    int updateByPrimaryKey(WechatReplyContent record);
}