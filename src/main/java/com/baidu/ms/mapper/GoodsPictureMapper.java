package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsPicture;
import com.baidu.ms.pojo.GoodsPictureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsPictureMapper {
    long countByExample(GoodsPictureExample example);

    int deleteByExample(GoodsPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsPicture record);

    int insertSelective(GoodsPicture record);

    List<GoodsPicture> selectByExample(GoodsPictureExample example);

    GoodsPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsPicture record, @Param("example") GoodsPictureExample example);

    int updateByExample(@Param("record") GoodsPicture record, @Param("example") GoodsPictureExample example);

    int updateByPrimaryKeySelective(GoodsPicture record);

    int updateByPrimaryKey(GoodsPicture record);
}