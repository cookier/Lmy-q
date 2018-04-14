package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityCashback;
import com.baidu.ms.pojo.ActivityCashbackExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityCashbackMapper {
    long countByExample(ActivityCashbackExample example);

    int deleteByExample(ActivityCashbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityCashback record);

    int insertSelective(ActivityCashback record);

    List<ActivityCashback> selectByExampleWithBLOBs(ActivityCashbackExample example);

    List<ActivityCashback> selectByExample(ActivityCashbackExample example);

    ActivityCashback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityCashback record, @Param("example") ActivityCashbackExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityCashback record, @Param("example") ActivityCashbackExample example);

    int updateByExample(@Param("record") ActivityCashback record, @Param("example") ActivityCashbackExample example);

    int updateByPrimaryKeySelective(ActivityCashback record);

    int updateByPrimaryKeyWithBLOBs(ActivityCashback record);

    int updateByPrimaryKey(ActivityCashback record);
}