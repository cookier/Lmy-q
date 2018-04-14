package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatRqcode;
import com.baidu.ms.pojo.WechatRqcodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatRqcodeMapper {
    long countByExample(WechatRqcodeExample example);

    int deleteByExample(WechatRqcodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatRqcode record);

    int insertSelective(WechatRqcode record);

    List<WechatRqcode> selectByExample(WechatRqcodeExample example);

    WechatRqcode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatRqcode record, @Param("example") WechatRqcodeExample example);

    int updateByExample(@Param("record") WechatRqcode record, @Param("example") WechatRqcodeExample example);

    int updateByPrimaryKeySelective(WechatRqcode record);

    int updateByPrimaryKey(WechatRqcode record);
}