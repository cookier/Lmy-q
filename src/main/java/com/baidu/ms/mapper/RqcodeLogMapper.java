package com.baidu.ms.mapper;

import com.baidu.ms.pojo.RqcodeLog;
import com.baidu.ms.pojo.RqcodeLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RqcodeLogMapper {
    long countByExample(RqcodeLogExample example);

    int deleteByExample(RqcodeLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RqcodeLog record);

    int insertSelective(RqcodeLog record);

    List<RqcodeLog> selectByExampleWithBLOBs(RqcodeLogExample example);

    List<RqcodeLog> selectByExample(RqcodeLogExample example);

    RqcodeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RqcodeLog record, @Param("example") RqcodeLogExample example);

    int updateByExampleWithBLOBs(@Param("record") RqcodeLog record, @Param("example") RqcodeLogExample example);

    int updateByExample(@Param("record") RqcodeLog record, @Param("example") RqcodeLogExample example);

    int updateByPrimaryKeySelective(RqcodeLog record);

    int updateByPrimaryKeyWithBLOBs(RqcodeLog record);

    int updateByPrimaryKey(RqcodeLog record);
}