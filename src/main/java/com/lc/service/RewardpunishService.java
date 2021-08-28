package com.lc.service;

import com.lc.entity.Rewardpunish;
import com.lc.vo.ResultVO;

public interface RewardpunishService {

    // 添加奖惩
    ResultVO insertRewardpunish(Rewardpunish rewardpunish);

    // 查看奖惩
    ResultVO selectRewardpunish();

    // 删除奖惩
    ResultVO deleteRewardpunish(Long rewardpunishid);

    // 修改奖惩
    ResultVO updateRewardpunish(Long rewardpunishid,Integer rewardpunishState,String rewardpunishDescription,Integer grade);

    // 根据真实姓名查看奖惩
    ResultVO selectRewardpunishByNickname(String nickname);
}
