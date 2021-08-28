package com.lc.dao;

import com.lc.entity.Celebrity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CelebrityMapper {
    int deleteByPrimaryKey(Long celebrityid);

    int insert(Celebrity record);

    int insertSelective(Celebrity record);

    Celebrity selectByPrimaryKey(Long celebrityid);
    List<Celebrity> selectAll();

    int updateByPrimaryKeySelective(Celebrity record);

    int updateByPrimaryKey(Celebrity record);
}