package com.baidu.ms.mapper;

import com.baidu.ms.pojo.UserAccountBill;
import com.baidu.ms.pojo.UserAccountBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAccountBillMapper {
    long countByExample(UserAccountBillExample example);

    int deleteByExample(UserAccountBillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(UserAccountBill record);

    int insertSelective(UserAccountBill record);

    List<UserAccountBill> selectByExampleWithBLOBs(UserAccountBillExample example);

    List<UserAccountBill> selectByExample(UserAccountBillExample example);

    UserAccountBill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") UserAccountBill record, @Param("example") UserAccountBillExample example);

    int updateByExampleWithBLOBs(@Param("record") UserAccountBill record, @Param("example") UserAccountBillExample example);

    int updateByExample(@Param("record") UserAccountBill record, @Param("example") UserAccountBillExample example);

    int updateByPrimaryKeySelective(UserAccountBill record);

    int updateByPrimaryKeyWithBLOBs(UserAccountBill record);

    int updateByPrimaryKey(UserAccountBill record);
}