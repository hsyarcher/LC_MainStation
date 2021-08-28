package com.lc.dao;

import com.lc.entity.User;
import com.lc.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userid);
    User selectByUsername(String username);

    // 管理员查看所有用户
    List<UserVO> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}