package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Document;
import com.baidu.ms.pojo.DocumentExample;
import com.baidu.ms.pojo.DocumentWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocumentMapper {
    long countByExample(DocumentExample example);

    int deleteByExample(DocumentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DocumentWithBLOBs record);

    int insertSelective(DocumentWithBLOBs record);

    List<DocumentWithBLOBs> selectByExampleWithBLOBs(DocumentExample example);

    List<Document> selectByExample(DocumentExample example);

    DocumentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DocumentWithBLOBs record, @Param("example") DocumentExample example);

    int updateByExampleWithBLOBs(@Param("record") DocumentWithBLOBs record, @Param("example") DocumentExample example);

    int updateByExample(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByPrimaryKeySelective(DocumentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DocumentWithBLOBs record);

    int updateByPrimaryKey(Document record);
}