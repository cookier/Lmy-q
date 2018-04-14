package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatShortcutWords;
import com.baidu.ms.pojo.WechatShortcutWordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatShortcutWordsMapper {
    long countByExample(WechatShortcutWordsExample example);

    int deleteByExample(WechatShortcutWordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatShortcutWords record);

    int insertSelective(WechatShortcutWords record);

    List<WechatShortcutWords> selectByExample(WechatShortcutWordsExample example);

    WechatShortcutWords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatShortcutWords record, @Param("example") WechatShortcutWordsExample example);

    int updateByExample(@Param("record") WechatShortcutWords record, @Param("example") WechatShortcutWordsExample example);

    int updateByPrimaryKeySelective(WechatShortcutWords record);

    int updateByPrimaryKey(WechatShortcutWords record);
}