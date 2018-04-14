package com.baidu.ms.mapper;

import com.baidu.ms.pojo.UserBankInfo;
import com.baidu.ms.pojo.UserBankInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserBankInfoMapper {
    long countByExample(UserBankInfoExample example);

    int deleteByExample(UserBankInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBankInfo record);

    int insertSelective(UserBankInfo record);

    List<UserBankInfo> selectByExample(UserBankInfoExample example);

    UserBankInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBankInfo record, @Param("example") UserBankInfoExample example);

    int updateByExample(@Param("record") UserBankInfo record, @Param("example") UserBankInfoExample example);

    int updateByPrimaryKeySelective(UserBankInfo record);

    int updateByPrimaryKey(UserBankInfo record);
}