package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityDirectsellerMember;
import com.baidu.ms.pojo.ActivityDirectsellerMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityDirectsellerMemberMapper {
    long countByExample(ActivityDirectsellerMemberExample example);

    int deleteByExample(ActivityDirectsellerMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDirectsellerMember record);

    int insertSelective(ActivityDirectsellerMember record);

    List<ActivityDirectsellerMember> selectByExample(ActivityDirectsellerMemberExample example);

    ActivityDirectsellerMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDirectsellerMember record, @Param("example") ActivityDirectsellerMemberExample example);

    int updateByExample(@Param("record") ActivityDirectsellerMember record, @Param("example") ActivityDirectsellerMemberExample example);

    int updateByPrimaryKeySelective(ActivityDirectsellerMember record);

    int updateByPrimaryKey(ActivityDirectsellerMember record);
}