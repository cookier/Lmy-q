package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DocumentCategory;
import com.baidu.ms.pojo.DocumentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocumentCategoryMapper {
    long countByExample(DocumentCategoryExample example);

    int deleteByExample(DocumentCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DocumentCategory record);

    int insertSelective(DocumentCategory record);

    List<DocumentCategory> selectByExample(DocumentCategoryExample example);

    DocumentCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DocumentCategory record, @Param("example") DocumentCategoryExample example);

    int updateByExample(@Param("record") DocumentCategory record, @Param("example") DocumentCategoryExample example);

    int updateByPrimaryKeySelective(DocumentCategory record);

    int updateByPrimaryKey(DocumentCategory record);
}