package com.baidu.ms.mapper;

import com.baidu.ms.pojo.AgentProxy;
import com.baidu.ms.pojo.AgentProxyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgentProxyMapper {
    long countByExample(AgentProxyExample example);

    int deleteByExample(AgentProxyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgentProxy record);

    int insertSelective(AgentProxy record);

    List<AgentProxy> selectByExampleWithBLOBs(AgentProxyExample example);

    List<AgentProxy> selectByExample(AgentProxyExample example);

    AgentProxy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgentProxy record, @Param("example") AgentProxyExample example);

    int updateByExampleWithBLOBs(@Param("record") AgentProxy record, @Param("example") AgentProxyExample example);

    int updateByExample(@Param("record") AgentProxy record, @Param("example") AgentProxyExample example);

    int updateByPrimaryKeySelective(AgentProxy record);

    int updateByPrimaryKeyWithBLOBs(AgentProxy record);

    int updateByPrimaryKey(AgentProxy record);
}