package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityLuckyTurntable;
import com.baidu.ms.pojo.ActivityLuckyTurntableExample;
import com.baidu.ms.pojo.ActivityLuckyTurntableWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityLuckyTurntableMapper {
    long countByExample(ActivityLuckyTurntableExample example);

    int deleteByExample(ActivityLuckyTurntableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityLuckyTurntableWithBLOBs record);

    int insertSelective(ActivityLuckyTurntableWithBLOBs record);

    List<ActivityLuckyTurntableWithBLOBs> selectByExampleWithBLOBs(ActivityLuckyTurntableExample example);

    List<ActivityLuckyTurntable> selectByExample(ActivityLuckyTurntableExample example);

    ActivityLuckyTurntableWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityLuckyTurntableWithBLOBs record, @Param("example") ActivityLuckyTurntableExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityLuckyTurntableWithBLOBs record, @Param("example") ActivityLuckyTurntableExample example);

    int updateByExample(@Param("record") ActivityLuckyTurntable record, @Param("example") ActivityLuckyTurntableExample example);

    int updateByPrimaryKeySelective(ActivityLuckyTurntableWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityLuckyTurntableWithBLOBs record);

    int updateByPrimaryKey(ActivityLuckyTurntable record);
}