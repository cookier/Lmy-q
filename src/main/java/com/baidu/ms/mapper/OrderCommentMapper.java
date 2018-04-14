package com.baidu.ms.mapper;

import com.baidu.ms.pojo.OrderComment;
import com.baidu.ms.pojo.OrderCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderCommentMapper {
    long countByExample(OrderCommentExample example);

    int deleteByExample(OrderCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderComment record);

    int insertSelective(OrderComment record);

    List<OrderComment> selectByExampleWithBLOBs(OrderCommentExample example);

    List<OrderComment> selectByExample(OrderCommentExample example);

    OrderComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByExample(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByPrimaryKeySelective(OrderComment record);

    int updateByPrimaryKeyWithBLOBs(OrderComment record);

    int updateByPrimaryKey(OrderComment record);
}