package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Keywords;
import com.baidu.ms.pojo.KeywordsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KeywordsMapper {
    long countByExample(KeywordsExample example);

    int deleteByExample(KeywordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Keywords record);

    int insertSelective(Keywords record);

    List<Keywords> selectByExample(KeywordsExample example);

    Keywords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Keywords record, @Param("example") KeywordsExample example);

    int updateByExample(@Param("record") Keywords record, @Param("example") KeywordsExample example);

    int updateByPrimaryKeySelective(Keywords record);

    int updateByPrimaryKey(Keywords record);
}