package com.baidu.ms.mapper;

import com.baidu.ms.pojo.CouponCodeSn;
import com.baidu.ms.pojo.CouponCodeSnExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponCodeSnMapper {
    long countByExample(CouponCodeSnExample example);

    int deleteByExample(CouponCodeSnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponCodeSn record);

    int insertSelective(CouponCodeSn record);

    List<CouponCodeSn> selectByExample(CouponCodeSnExample example);

    CouponCodeSn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponCodeSn record, @Param("example") CouponCodeSnExample example);

    int updateByExample(@Param("record") CouponCodeSn record, @Param("example") CouponCodeSnExample example);

    int updateByPrimaryKeySelective(CouponCodeSn record);

    int updateByPrimaryKey(CouponCodeSn record);
}