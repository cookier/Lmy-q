package com.baidu.ms.mapper;

import com.baidu.ms.pojo.BonusNumRecord;
import com.baidu.ms.pojo.BonusNumRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BonusNumRecordMapper {
    long countByExample(BonusNumRecordExample example);

    int deleteByExample(BonusNumRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BonusNumRecord record);

    int insertSelective(BonusNumRecord record);

    List<BonusNumRecord> selectByExample(BonusNumRecordExample example);

    BonusNumRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BonusNumRecord record, @Param("example") BonusNumRecordExample example);

    int updateByExample(@Param("record") BonusNumRecord record, @Param("example") BonusNumRecordExample example);

    int updateByPrimaryKeySelective(BonusNumRecord record);

    int updateByPrimaryKey(BonusNumRecord record);
}