package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ResourceFile;
import com.baidu.ms.pojo.ResourceFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceFileMapper {
    long countByExample(ResourceFileExample example);

    int deleteByExample(ResourceFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResourceFile record);

    int insertSelective(ResourceFile record);

    List<ResourceFile> selectByExample(ResourceFileExample example);

    ResourceFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResourceFile record, @Param("example") ResourceFileExample example);

    int updateByExample(@Param("record") ResourceFile record, @Param("example") ResourceFileExample example);

    int updateByPrimaryKeySelective(ResourceFile record);

    int updateByPrimaryKey(ResourceFile record);
}