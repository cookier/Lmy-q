package com.baidu.ms.mapper;

import com.baidu.ms.pojo.PrizeAllocate;
import com.baidu.ms.pojo.PrizeAllocateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrizeAllocateMapper {
    long countByExample(PrizeAllocateExample example);

    int deleteByExample(PrizeAllocateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrizeAllocate record);

    int insertSelective(PrizeAllocate record);

    List<PrizeAllocate> selectByExampleWithBLOBs(PrizeAllocateExample example);

    List<PrizeAllocate> selectByExample(PrizeAllocateExample example);

    PrizeAllocate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrizeAllocate record, @Param("example") PrizeAllocateExample example);

    int updateByExampleWithBLOBs(@Param("record") PrizeAllocate record, @Param("example") PrizeAllocateExample example);

    int updateByExample(@Param("record") PrizeAllocate record, @Param("example") PrizeAllocateExample example);

    int updateByPrimaryKeySelective(PrizeAllocate record);

    int updateByPrimaryKeyWithBLOBs(PrizeAllocate record);

    int updateByPrimaryKey(PrizeAllocate record);
}