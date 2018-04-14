package com.baidu.ms.mapper;

import com.baidu.ms.pojo.DeliveryTemplate;
import com.baidu.ms.pojo.DeliveryTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliveryTemplateMapper {
    long countByExample(DeliveryTemplateExample example);

    int deleteByExample(DeliveryTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeliveryTemplate record);

    int insertSelective(DeliveryTemplate record);

    List<DeliveryTemplate> selectByExampleWithBLOBs(DeliveryTemplateExample example);

    List<DeliveryTemplate> selectByExample(DeliveryTemplateExample example);

    DeliveryTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeliveryTemplate record, @Param("example") DeliveryTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") DeliveryTemplate record, @Param("example") DeliveryTemplateExample example);

    int updateByExample(@Param("record") DeliveryTemplate record, @Param("example") DeliveryTemplateExample example);

    int updateByPrimaryKeySelective(DeliveryTemplate record);

    int updateByPrimaryKeyWithBLOBs(DeliveryTemplate record);

    int updateByPrimaryKey(DeliveryTemplate record);
}