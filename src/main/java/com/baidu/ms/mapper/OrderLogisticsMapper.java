package com.baidu.ms.mapper;

import com.baidu.ms.pojo.OrderLogistics;
import com.baidu.ms.pojo.OrderLogisticsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderLogisticsMapper {
    long countByExample(OrderLogisticsExample example);

    int deleteByExample(OrderLogisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    List<OrderLogistics> selectByExampleWithBLOBs(OrderLogisticsExample example);

    List<OrderLogistics> selectByExample(OrderLogisticsExample example);

    OrderLogistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByExample(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKeyWithBLOBs(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);
}