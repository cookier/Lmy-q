package com.baidu.ms.mapper;

import com.baidu.ms.pojo.ActivityGuaguaCard;
import com.baidu.ms.pojo.ActivityGuaguaCardExample;
import com.baidu.ms.pojo.ActivityGuaguaCardWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityGuaguaCardMapper {
    long countByExample(ActivityGuaguaCardExample example);

    int deleteByExample(ActivityGuaguaCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityGuaguaCardWithBLOBs record);

    int insertSelective(ActivityGuaguaCardWithBLOBs record);

    List<ActivityGuaguaCardWithBLOBs> selectByExampleWithBLOBs(ActivityGuaguaCardExample example);

    List<ActivityGuaguaCard> selectByExample(ActivityGuaguaCardExample example);

    ActivityGuaguaCardWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityGuaguaCardWithBLOBs record, @Param("example") ActivityGuaguaCardExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityGuaguaCardWithBLOBs record, @Param("example") ActivityGuaguaCardExample example);

    int updateByExample(@Param("record") ActivityGuaguaCard record, @Param("example") ActivityGuaguaCardExample example);

    int updateByPrimaryKeySelective(ActivityGuaguaCardWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityGuaguaCardWithBLOBs record);

    int updateByPrimaryKey(ActivityGuaguaCard record);
}