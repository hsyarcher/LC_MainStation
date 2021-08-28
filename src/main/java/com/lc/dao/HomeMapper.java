package com.lc.dao;

import com.lc.entity.Home;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
}