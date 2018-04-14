package com.baidu.ms.mapper;

import com.baidu.ms.pojo.PlatformRolePermission;
import com.baidu.ms.pojo.PlatformRolePermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlatformRolePermissionMapper {
    long countByExample(PlatformRolePermissionExample example);

    int deleteByExample(PlatformRolePermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatformRolePermission record);

    int insertSelective(PlatformRolePermission record);

    List<PlatformRolePermission> selectByExample(PlatformRolePermissionExample example);

    PlatformRolePermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatformRolePermission record, @Param("example") PlatformRolePermissionExample example);

    int updateByExample(@Param("record") PlatformRolePermission record, @Param("example") PlatformRolePermissionExample example);

    int updateByPrimaryKeySelective(PlatformRolePermission record);

    int updateByPrimaryKey(PlatformRolePermission record);
}