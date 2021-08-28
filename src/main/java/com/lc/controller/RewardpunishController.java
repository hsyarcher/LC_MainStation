package com.lc.controller;

import com.lc.entity.Rewardpunish;
import com.lc.service.RewardpunishService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/lc/user/rewardpunish")
public class RewardpunishController {

    @Autowired
    private RewardpunishService rewardpunishService;

    // 添加奖惩
    @PostMapping("/insert")
    public ResultVO insertRewardpunish(Rewardpunish rewardpunish){
        return rewardpunishService.insertRewardpunish(rewardpunish);
    }

    // 查看奖惩
    @GetMapping("/select")
    public ResultVO selectRewardpunish(){
        return rewardpunishService.selectRewardpunish();
    }

    // 删除奖惩
    @DeleteMapping("/delete")
    public ResultVO deleteRewardpunish(Long rewardpunishid){
        return rewardpunishService.deleteRewardpunish(rewardpunishid);
    }

    // 修改奖惩
    @PutMapping("/update")
    public ResultVO updateRewardpunish(Long rewardpunishid,Integer state,String rewardpunishDescription,Integer grade){
        return rewardpunishService.updateRewardpunish(rewardpunishid,state,rewardpunishDescription,grade);
    }

    // 根据真实姓名查看奖惩
    @GetMapping("select/nickname")
    public ResultVO selectRewardpunishByNickname(String nickname){
        return rewardpunishService.selectRewardpunishByNickname(nickname);
    }
}
