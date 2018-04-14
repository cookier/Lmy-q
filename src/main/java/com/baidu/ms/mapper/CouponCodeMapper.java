package com.baidu.ms.mapper;

import com.baidu.ms.pojo.CouponCode;
import com.baidu.ms.pojo.CouponCodeExample;
import com.baidu.ms.pojo.CouponCodeWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponCodeMapper {
    long countByExample(CouponCodeExample example);

    int deleteByExample(CouponCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponCodeWithBLOBs record);

    int insertSelective(CouponCodeWithBLOBs record);

    List<CouponCodeWithBLOBs> selectByExampleWithBLOBs(CouponCodeExample example);

    List<CouponCode> selectByExample(CouponCodeExample example);

    CouponCodeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponCodeWithBLOBs record, @Param("example") CouponCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") CouponCodeWithBLOBs record, @Param("example") CouponCodeExample example);

    int updateByExample(@Param("record") CouponCode record, @Param("example") CouponCodeExample example);

    int updateByPrimaryKeySelective(CouponCodeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CouponCodeWithBLOBs record);

    int updateByPrimaryKey(CouponCode record);
}