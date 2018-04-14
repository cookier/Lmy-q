package com.baidu.ms.mapper;

import com.baidu.ms.pojo.OrderSafe;
import com.baidu.ms.pojo.OrderSafeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderSafeMapper {
    long countByExample(OrderSafeExample example);

    int deleteByExample(OrderSafeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderSafe record);

    int insertSelective(OrderSafe record);

    List<OrderSafe> selectByExample(OrderSafeExample example);

    OrderSafe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderSafe record, @Param("example") OrderSafeExample example);

    int updateByExample(@Param("record") OrderSafe record, @Param("example") OrderSafeExample example);

    int updateByPrimaryKeySelective(OrderSafe record);

    int updateByPrimaryKey(OrderSafe record);
}