package com.baidu.ms.mapper;

import com.baidu.ms.pojo.LinkUrl;
import com.baidu.ms.pojo.LinkUrlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinkUrlMapper {
    long countByExample(LinkUrlExample example);

    int deleteByExample(LinkUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LinkUrl record);

    int insertSelective(LinkUrl record);

    List<LinkUrl> selectByExample(LinkUrlExample example);

    LinkUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LinkUrl record, @Param("example") LinkUrlExample example);

    int updateByExample(@Param("record") LinkUrl record, @Param("example") LinkUrlExample example);

    int updateByPrimaryKeySelective(LinkUrl record);

    int updateByPrimaryKey(LinkUrl record);
}