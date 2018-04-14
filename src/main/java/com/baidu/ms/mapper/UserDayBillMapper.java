package com.baidu.ms.mapper;

import com.baidu.ms.pojo.UserDayBill;
import com.baidu.ms.pojo.UserDayBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDayBillMapper {
    long countByExample(UserDayBillExample example);

    int deleteByExample(UserDayBillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDayBill record);

    int insertSelective(UserDayBill record);

    List<UserDayBill> selectByExample(UserDayBillExample example);

    UserDayBill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDayBill record, @Param("example") UserDayBillExample example);

    int updateByExample(@Param("record") UserDayBill record, @Param("example") UserDayBillExample example);

    int updateByPrimaryKeySelective(UserDayBill record);

    int updateByPrimaryKey(UserDayBill record);
}