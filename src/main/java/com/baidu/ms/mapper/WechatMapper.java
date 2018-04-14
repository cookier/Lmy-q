package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Wechat;
import com.baidu.ms.pojo.WechatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatMapper {
    long countByExample(WechatExample example);

    int deleteByExample(WechatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wechat record);

    int insertSelective(Wechat record);

    List<Wechat> selectByExample(WechatExample example);

    Wechat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wechat record, @Param("example") WechatExample example);

    int updateByExample(@Param("record") Wechat record, @Param("example") WechatExample example);

    int updateByPrimaryKeySelective(Wechat record);

    int updateByPrimaryKey(Wechat record);
}