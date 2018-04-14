package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatNews;
import com.baidu.ms.pojo.WechatNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatNewsMapper {
    long countByExample(WechatNewsExample example);

    int deleteByExample(WechatNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatNews record);

    int insertSelective(WechatNews record);

    List<WechatNews> selectByExampleWithBLOBs(WechatNewsExample example);

    List<WechatNews> selectByExample(WechatNewsExample example);

    WechatNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatNews record, @Param("example") WechatNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatNews record, @Param("example") WechatNewsExample example);

    int updateByExample(@Param("record") WechatNews record, @Param("example") WechatNewsExample example);

    int updateByPrimaryKeySelective(WechatNews record);

    int updateByPrimaryKeyWithBLOBs(WechatNews record);

    int updateByPrimaryKey(WechatNews record);
}