package com.baidu.ms.mapper;

import com.baidu.ms.pojo.AgentOrder;
import com.baidu.ms.pojo.AgentOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgentOrderMapper {
    long countByExample(AgentOrderExample example);

    int deleteByExample(AgentOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgentOrder record);

    int insertSelective(AgentOrder record);

    List<AgentOrder> selectByExample(AgentOrderExample example);

    AgentOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgentOrder record, @Param("example") AgentOrderExample example);

    int updateByExample(@Param("record") AgentOrder record, @Param("example") AgentOrderExample example);

    int updateByPrimaryKeySelective(AgentOrder record);

    int updateByPrimaryKey(AgentOrder record);
}