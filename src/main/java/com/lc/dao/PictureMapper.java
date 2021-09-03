package com.lc.dao;

import com.lc.entity.Picture;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PictureMapper {
    int deleteByPrimaryKey(Long pictureId);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByName(String name);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}