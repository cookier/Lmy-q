package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityBonusDistribution;
import com.baidu.ms.pojo.ActivityBonusDistributionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityBonusDistributionMapper {
    long countByExample(ActivityBonusDistributionExample example);

    int deleteByExample(ActivityBonusDistributionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityBonusDistribution record);

    int insertSelective(ActivityBonusDistribution record);

    List<ActivityBonusDistribution> selectByExampleWithBLOBs(ActivityBonusDistributionExample example);

    List<ActivityBonusDistribution> selectByExample(ActivityBonusDistributionExample example);

    ActivityBonusDistribution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityBonusDistribution record, @Param("example") ActivityBonusDistributionExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityBonusDistribution record, @Param("example") ActivityBonusDistributionExample example);

    int updateByExample(@Param("record") ActivityBonusDistribution record, @Param("example") ActivityBonusDistributionExample example);

    int updateByPrimaryKeySelective(ActivityBonusDistribution record);

    int updateByPrimaryKeyWithBLOBs(ActivityBonusDistribution record);

    int updateByPrimaryKey(ActivityBonusDistribution record);
}