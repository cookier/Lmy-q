package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityGroupPurchaseLog;
import com.baidu.ms.pojo.ActivityGroupPurchaseLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityGroupPurchaseLogMapper {
    long countByExample(ActivityGroupPurchaseLogExample example);

    int deleteByExample(ActivityGroupPurchaseLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityGroupPurchaseLog record);

    int insertSelective(ActivityGroupPurchaseLog record);

    List<ActivityGroupPurchaseLog> selectByExample(ActivityGroupPurchaseLogExample example);

    ActivityGroupPurchaseLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityGroupPurchaseLog record, @Param("example") ActivityGroupPurchaseLogExample example);

    int updateByExample(@Param("record") ActivityGroupPurchaseLog record, @Param("example") ActivityGroupPurchaseLogExample example);

    int updateByPrimaryKeySelective(ActivityGroupPurchaseLog record);

    int updateByPrimaryKey(ActivityGroupPurchaseLog record);
}