package com.baidu.ms.mapper;

import com.baidu.ms.pojo.AgentArea;
import com.baidu.ms.pojo.AgentAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgentAreaMapper {
    long countByExample(AgentAreaExample example);

    int deleteByExample(AgentAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgentArea record);

    int insertSelective(AgentArea record);

    List<AgentArea> selectByExample(AgentAreaExample example);

    AgentArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgentArea record, @Param("example") AgentAreaExample example);

    int updateByExample(@Param("record") AgentArea record, @Param("example") AgentAreaExample example);

    int updateByPrimaryKeySelective(AgentArea record);

    int updateByPrimaryKey(AgentArea record);
}