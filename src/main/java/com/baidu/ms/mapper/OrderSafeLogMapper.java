package com.baidu.ms.mapper;

import com.baidu.ms.pojo.OrderSafeLog;
import com.baidu.ms.pojo.OrderSafeLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderSafeLogMapper {
    long countByExample(OrderSafeLogExample example);

    int deleteByExample(OrderSafeLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderSafeLog record);

    int insertSelective(OrderSafeLog record);

    List<OrderSafeLog> selectByExampleWithBLOBs(OrderSafeLogExample example);

    List<OrderSafeLog> selectByExample(OrderSafeLogExample example);

    OrderSafeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderSafeLog record, @Param("example") OrderSafeLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderSafeLog record, @Param("example") OrderSafeLogExample example);

    int updateByExample(@Param("record") OrderSafeLog record, @Param("example") OrderSafeLogExample example);

    int updateByPrimaryKeySelective(OrderSafeLog record);

    int updateByPrimaryKeyWithBLOBs(OrderSafeLog record);

    int updateByPrimaryKey(OrderSafeLog record);
}