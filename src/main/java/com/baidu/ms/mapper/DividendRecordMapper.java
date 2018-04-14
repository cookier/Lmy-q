package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DividendRecord;
import com.baidu.ms.pojo.DividendRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DividendRecordMapper {
    long countByExample(DividendRecordExample example);

    int deleteByExample(DividendRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DividendRecord record);

    int insertSelective(DividendRecord record);

    List<DividendRecord> selectByExample(DividendRecordExample example);

    DividendRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DividendRecord record, @Param("example") DividendRecordExample example);

    int updateByExample(@Param("record") DividendRecord record, @Param("example") DividendRecordExample example);

    int updateByPrimaryKeySelective(DividendRecord record);

    int updateByPrimaryKey(DividendRecord record);
}