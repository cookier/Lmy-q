package com.baidu.ms.mapper;

import com.baidu.ms.pojo.PlatformRole;
import com.baidu.ms.pojo.PlatformRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlatformRoleMapper {
    long countByExample(PlatformRoleExample example);

    int deleteByExample(PlatformRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatformRole record);

    int insertSelective(PlatformRole record);

    List<PlatformRole> selectByExample(PlatformRoleExample example);

    PlatformRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatformRole record, @Param("example") PlatformRoleExample example);

    int updateByExample(@Param("record") PlatformRole record, @Param("example") PlatformRoleExample example);

    int updateByPrimaryKeySelective(PlatformRole record);

    int updateByPrimaryKey(PlatformRole record);
}