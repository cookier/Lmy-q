package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Checkin;
import com.baidu.ms.pojo.CheckinExample;
import com.baidu.ms.pojo.CheckinWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckinMapper {
    long countByExample(CheckinExample example);

    int deleteByExample(CheckinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckinWithBLOBs record);

    int insertSelective(CheckinWithBLOBs record);

    List<CheckinWithBLOBs> selectByExampleWithBLOBs(CheckinExample example);

    List<Checkin> selectByExample(CheckinExample example);

    CheckinWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckinWithBLOBs record, @Param("example") CheckinExample example);

    int updateByExampleWithBLOBs(@Param("record") CheckinWithBLOBs record, @Param("example") CheckinExample example);

    int updateByExample(@Param("record") Checkin record, @Param("example") CheckinExample example);

    int updateByPrimaryKeySelective(CheckinWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CheckinWithBLOBs record);

    int updateByPrimaryKey(Checkin record);
}