package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DataVisitorDevice;
import com.baidu.ms.pojo.DataVisitorDeviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataVisitorDeviceMapper {
    long countByExample(DataVisitorDeviceExample example);

    int deleteByExample(DataVisitorDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataVisitorDevice record);

    int insertSelective(DataVisitorDevice record);

    List<DataVisitorDevice> selectByExample(DataVisitorDeviceExample example);

    DataVisitorDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataVisitorDevice record, @Param("example") DataVisitorDeviceExample example);

    int updateByExample(@Param("record") DataVisitorDevice record, @Param("example") DataVisitorDeviceExample example);

    int updateByPrimaryKeySelective(DataVisitorDevice record);

    int updateByPrimaryKey(DataVisitorDevice record);
}