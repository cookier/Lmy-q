package com.baidu.ms.mapper;

import com.baidu.ms.pojo.AreaProxy;
import com.baidu.ms.pojo.AreaProxyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaProxyMapper {
    long countByExample(AreaProxyExample example);

    int deleteByExample(AreaProxyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaProxy record);

    int insertSelective(AreaProxy record);

    List<AreaProxy> selectByExampleWithBLOBs(AreaProxyExample example);

    List<AreaProxy> selectByExample(AreaProxyExample example);

    AreaProxy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaProxy record, @Param("example") AreaProxyExample example);

    int updateByExampleWithBLOBs(@Param("record") AreaProxy record, @Param("example") AreaProxyExample example);

    int updateByExample(@Param("record") AreaProxy record, @Param("example") AreaProxyExample example);

    int updateByPrimaryKeySelective(AreaProxy record);

    int updateByPrimaryKeyWithBLOBs(AreaProxy record);

    int updateByPrimaryKey(AreaProxy record);
}