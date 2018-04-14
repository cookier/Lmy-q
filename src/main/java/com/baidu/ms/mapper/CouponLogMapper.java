package com.baidu.ms.mapper;

import com.baidu.ms.pojo.CouponLog;
import com.baidu.ms.pojo.CouponLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CouponLogMapper {
    long countByExample(CouponLogExample example);

    int deleteByExample(CouponLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponLog record);

    int insertSelective(CouponLog record);

    List<CouponLog> selectByExample(CouponLogExample example);

    CouponLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponLog record, @Param("example") CouponLogExample example);

    int updateByExample(@Param("record") CouponLog record, @Param("example") CouponLogExample example);

    int updateByPrimaryKeySelective(CouponLog record);

    int updateByPrimaryKey(CouponLog record);
}