package com.lc.dao;

import com.lc.entity.Goal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoalMapper {
    int deleteByPrimaryKey(Long goalid);

    int insert(Goal record);

    int insertSelective(Goal record);

    Goal selectByPrimaryKey(Long goalid);
    List<Goal> selectAll();
    List<Goal> selectByUserid(Long userid);

    int updateByPrimaryKeySelective(Goal record);

    int updateByPrimaryKey(Goal record);
}