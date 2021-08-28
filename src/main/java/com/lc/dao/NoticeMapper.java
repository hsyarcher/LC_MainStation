package com.lc.dao;

import com.lc.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(Long noticeid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Long noticeid);
    List<Notice> selectAll();

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}