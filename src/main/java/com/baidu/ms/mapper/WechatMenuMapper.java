package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatMenu;
import com.baidu.ms.pojo.WechatMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatMenuMapper {
    long countByExample(WechatMenuExample example);

    int deleteByExample(WechatMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatMenu record);

    int insertSelective(WechatMenu record);

    List<WechatMenu> selectByExampleWithBLOBs(WechatMenuExample example);

    List<WechatMenu> selectByExample(WechatMenuExample example);

    WechatMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatMenu record, @Param("example") WechatMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatMenu record, @Param("example") WechatMenuExample example);

    int updateByExample(@Param("record") WechatMenu record, @Param("example") WechatMenuExample example);

    int updateByPrimaryKeySelective(WechatMenu record);

    int updateByPrimaryKeyWithBLOBs(WechatMenu record);

    int updateByPrimaryKey(WechatMenu record);
}