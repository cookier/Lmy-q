package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ShopGoodsTemplate;
import com.baidu.ms.pojo.ShopGoodsTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopGoodsTemplateMapper {
    long countByExample(ShopGoodsTemplateExample example);

    int deleteByExample(ShopGoodsTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopGoodsTemplate record);

    int insertSelective(ShopGoodsTemplate record);

    List<ShopGoodsTemplate> selectByExampleWithBLOBs(ShopGoodsTemplateExample example);

    List<ShopGoodsTemplate> selectByExample(ShopGoodsTemplateExample example);

    ShopGoodsTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopGoodsTemplate record, @Param("example") ShopGoodsTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopGoodsTemplate record, @Param("example") ShopGoodsTemplateExample example);

    int updateByExample(@Param("record") ShopGoodsTemplate record, @Param("example") ShopGoodsTemplateExample example);

    int updateByPrimaryKeySelective(ShopGoodsTemplate record);

    int updateByPrimaryKeyWithBLOBs(ShopGoodsTemplate record);

    int updateByPrimaryKey(ShopGoodsTemplate record);
}