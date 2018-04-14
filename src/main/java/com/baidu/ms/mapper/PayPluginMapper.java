package com.baidu.ms.mapper;

import com.baidu.ms.pojo.PayPlugin;
import com.baidu.ms.pojo.PayPluginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayPluginMapper {
    long countByExample(PayPluginExample example);

    int deleteByExample(PayPluginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayPlugin record);

    int insertSelective(PayPlugin record);

    List<PayPlugin> selectByExampleWithBLOBs(PayPluginExample example);

    List<PayPlugin> selectByExample(PayPluginExample example);

    PayPlugin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayPlugin record, @Param("example") PayPluginExample example);

    int updateByExampleWithBLOBs(@Param("record") PayPlugin record, @Param("example") PayPluginExample example);

    int updateByExample(@Param("record") PayPlugin record, @Param("example") PayPluginExample example);

    int updateByPrimaryKeySelective(PayPlugin record);

    int updateByPrimaryKeyWithBLOBs(PayPlugin record);

    int updateByPrimaryKey(PayPlugin record);
}