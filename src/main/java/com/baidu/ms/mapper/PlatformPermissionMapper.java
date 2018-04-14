package com.baidu.ms.mapper;

import com.baidu.ms.pojo.PlatformPermission;
import com.baidu.ms.pojo.PlatformPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlatformPermissionMapper {
    long countByExample(PlatformPermissionExample example);

    int deleteByExample(PlatformPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlatformPermission record);

    int insertSelective(PlatformPermission record);

    List<PlatformPermission> selectByExample(PlatformPermissionExample example);

    PlatformPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlatformPermission record, @Param("example") PlatformPermissionExample example);

    int updateByExample(@Param("record") PlatformPermission record, @Param("example") PlatformPermissionExample example);

    int updateByPrimaryKeySelective(PlatformPermission record);

    int updateByPrimaryKey(PlatformPermission record);
}