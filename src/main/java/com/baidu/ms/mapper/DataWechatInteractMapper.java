package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataWechatInteract;
import com.baidu.ms.pojo.DataWechatInteractExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataWechatInteractMapper {
    long countByExample(DataWechatInteractExample example);

    int deleteByExample(DataWechatInteractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataWechatInteract record);

    int insertSelective(DataWechatInteract record);

    List<DataWechatInteract> selectByExample(DataWechatInteractExample example);

    DataWechatInteract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataWechatInteract record, @Param("example") DataWechatInteractExample example);

    int updateByExample(@Param("record") DataWechatInteract record, @Param("example") DataWechatInteractExample example);

    int updateByPrimaryKeySelective(DataWechatInteract record);

    int updateByPrimaryKey(DataWechatInteract record);
}