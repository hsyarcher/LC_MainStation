package com.lc.dao;

import com.lc.entity.Rewardpunish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RewardpunishMapper {
    int deleteByPrimaryKey(Long rewardpunishid);

    int insert(Rewardpunish record);

    int insertSelective(Rewardpunish record);

    Rewardpunish selectByPrimaryKey(Long rewardpunishid);
    List<Rewardpunish> selectAll();
    List<Rewardpunish> selectByNickname(String nickname);

    int updateByPrimaryKeySelective(Rewardpunish record);

    int updateByPrimaryKey(Rewardpunish record);
}