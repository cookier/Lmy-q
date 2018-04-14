package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DividendDetails;
import com.baidu.ms.pojo.DividendDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DividendDetailsMapper {
    long countByExample(DividendDetailsExample example);

    int deleteByExample(DividendDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DividendDetails record);

    int insertSelective(DividendDetails record);

    List<DividendDetails> selectByExample(DividendDetailsExample example);

    DividendDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DividendDetails record, @Param("example") DividendDetailsExample example);

    int updateByExample(@Param("record") DividendDetails record, @Param("example") DividendDetailsExample example);

    int updateByPrimaryKeySelective(DividendDetails record);

    int updateByPrimaryKey(DividendDetails record);
}