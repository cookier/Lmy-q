package com.baidu.ms.mapper;

import com.baidu.ms.pojo.OrderGoodsItem;
import com.baidu.ms.pojo.OrderGoodsItemExample;
import com.baidu.ms.pojo.OrderGoodsItemWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderGoodsItemMapper {
    long countByExample(OrderGoodsItemExample example);

    int deleteByExample(OrderGoodsItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoodsItemWithBLOBs record);

    int insertSelective(OrderGoodsItemWithBLOBs record);

    List<OrderGoodsItemWithBLOBs> selectByExampleWithBLOBs(OrderGoodsItemExample example);

    List<OrderGoodsItem> selectByExample(OrderGoodsItemExample example);

    OrderGoodsItemWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderGoodsItemWithBLOBs record, @Param("example") OrderGoodsItemExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderGoodsItemWithBLOBs record, @Param("example") OrderGoodsItemExample example);

    int updateByExample(@Param("record") OrderGoodsItem record, @Param("example") OrderGoodsItemExample example);

    int updateByPrimaryKeySelective(OrderGoodsItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderGoodsItemWithBLOBs record);

    int updateByPrimaryKey(OrderGoodsItem record);
}