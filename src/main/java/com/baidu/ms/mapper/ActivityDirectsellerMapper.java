package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityDirectseller;
import com.baidu.ms.pojo.ActivityDirectsellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityDirectsellerMapper {
    long countByExample(ActivityDirectsellerExample example);

    int deleteByExample(ActivityDirectsellerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDirectseller record);

    int insertSelective(ActivityDirectseller record);

    List<ActivityDirectseller> selectByExampleWithBLOBs(ActivityDirectsellerExample example);

    List<ActivityDirectseller> selectByExample(ActivityDirectsellerExample example);

    ActivityDirectseller selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDirectseller record, @Param("example") ActivityDirectsellerExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityDirectseller record, @Param("example") ActivityDirectsellerExample example);

    int updateByExample(@Param("record") ActivityDirectseller record, @Param("example") ActivityDirectsellerExample example);

    int updateByPrimaryKeySelective(ActivityDirectseller record);

    int updateByPrimaryKeyWithBLOBs(ActivityDirectseller record);

    int updateByPrimaryKey(ActivityDirectseller record);
}