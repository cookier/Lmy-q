package com.baidu.ms.mapper;

import com.baidu.ms.pojo.Agent;
import com.baidu.ms.pojo.AgentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgentMapper {
    long countByExample(AgentExample example);

    int deleteByExample(AgentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Agent record);

    int insertSelective(Agent record);

    List<Agent> selectByExampleWithBLOBs(AgentExample example);

    List<Agent> selectByExample(AgentExample example);

    Agent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByExampleWithBLOBs(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByExample(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKeyWithBLOBs(Agent record);

    int updateByPrimaryKey(Agent record);
}