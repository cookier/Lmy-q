package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityGroupPurchase;
import com.baidu.ms.pojo.ActivityGroupPurchaseExample;
import com.baidu.ms.pojo.ActivityGroupPurchaseWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityGroupPurchaseMapper {
    long countByExample(ActivityGroupPurchaseExample example);

    int deleteByExample(ActivityGroupPurchaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityGroupPurchaseWithBLOBs record);

    int insertSelective(ActivityGroupPurchaseWithBLOBs record);

    List<ActivityGroupPurchaseWithBLOBs> selectByExampleWithBLOBs(ActivityGroupPurchaseExample example);

    List<ActivityGroupPurchase> selectByExample(ActivityGroupPurchaseExample example);

    ActivityGroupPurchaseWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityGroupPurchaseWithBLOBs record, @Param("example") ActivityGroupPurchaseExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityGroupPurchaseWithBLOBs record, @Param("example") ActivityGroupPurchaseExample example);

    int updateByExample(@Param("record") ActivityGroupPurchase record, @Param("example") ActivityGroupPurchaseExample example);

    int updateByPrimaryKeySelective(ActivityGroupPurchaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityGroupPurchaseWithBLOBs record);

    int updateByPrimaryKey(ActivityGroupPurchase record);
}