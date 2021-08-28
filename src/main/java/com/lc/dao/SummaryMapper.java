package com.lc.dao;

import com.lc.entity.Summary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SummaryMapper {
    int deleteByPrimaryKey(Long summaryid);

    int insert(Summary record);

    int insertSelective(Summary record);

    Summary selectByPrimaryKey(Long summaryid);
    List<Summary> selectAllByUserid(Long userid);

    int updateByPrimaryKeySelective(Summary record);

    int updateByPrimaryKey(Summary record);
}