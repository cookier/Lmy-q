package com.baidu.ms.mapper;

import com.baidu.ms.pojo.WechatGroupsend;
import com.baidu.ms.pojo.WechatGroupsendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatGroupsendMapper {
    long countByExample(WechatGroupsendExample example);

    int deleteByExample(WechatGroupsendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatGroupsend record);

    int insertSelective(WechatGroupsend record);

    List<WechatGroupsend> selectByExampleWithBLOBs(WechatGroupsendExample example);

    List<WechatGroupsend> selectByExample(WechatGroupsendExample example);

    WechatGroupsend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WechatGroupsend record, @Param("example") WechatGroupsendExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatGroupsend record, @Param("example") WechatGroupsendExample example);

    int updateByExample(@Param("record") WechatGroupsend record, @Param("example") WechatGroupsendExample example);

    int updateByPrimaryKeySelective(WechatGroupsend record);

    int updateByPrimaryKeyWithBLOBs(WechatGroupsend record);

    int updateByPrimaryKey(WechatGroupsend record);
}