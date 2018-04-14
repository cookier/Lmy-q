package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Coupon;
import com.baidu.ms.pojo.CouponExample;
import com.baidu.ms.pojo.CouponWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponMapper {
    long countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponWithBLOBs record);

    int insertSelective(CouponWithBLOBs record);

    List<CouponWithBLOBs> selectByExampleWithBLOBs(CouponExample example);

    List<Coupon> selectByExample(CouponExample example);

    CouponWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponWithBLOBs record, @Param("example") CouponExample example);

    int updateByExampleWithBLOBs(@Param("record") CouponWithBLOBs record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(CouponWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CouponWithBLOBs record);

    int updateByPrimaryKey(Coupon record);
}