package com.lc.dao;

import com.lc.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedbackMapper {
    int deleteByPrimaryKey(Long feedbackid);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Long feedbackid);
    List<Feedback> selectAll();

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}