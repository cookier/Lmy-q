package com.baidu.ms.mapper;

import com.baidu.ms.pojo.GoodsReview;
import com.baidu.ms.pojo.GoodsReviewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsReviewMapper {
    long countByExample(GoodsReviewExample example);

    int deleteByExample(GoodsReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsReview record);

    int insertSelective(GoodsReview record);

    List<GoodsReview> selectByExample(GoodsReviewExample example);

    GoodsReview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsReview record, @Param("example") GoodsReviewExample example);

    int updateByExample(@Param("record") GoodsReview record, @Param("example") GoodsReviewExample example);

    int updateByPrimaryKeySelective(GoodsReview record);

    int updateByPrimaryKey(GoodsReview record);
}