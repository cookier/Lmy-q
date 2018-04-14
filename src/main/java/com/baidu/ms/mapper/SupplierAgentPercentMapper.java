package com.baidu.ms.mapper;

import com.baidu.ms.pojo.SupplierAgentPercent;
import com.baidu.ms.pojo.SupplierAgentPercentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierAgentPercentMapper {
    long countByExample(SupplierAgentPercentExample example);

    int deleteByExample(SupplierAgentPercentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierAgentPercent record);

    int insertSelective(SupplierAgentPercent record);

    List<SupplierAgentPercent> selectByExample(SupplierAgentPercentExample example);

    SupplierAgentPercent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierAgentPercent record, @Param("example") SupplierAgentPercentExample example);

    int updateByExample(@Param("record") SupplierAgentPercent record, @Param("example") SupplierAgentPercentExample example);

    int updateByPrimaryKeySelective(SupplierAgentPercent record);

    int updateByPrimaryKey(SupplierAgentPercent record);
}