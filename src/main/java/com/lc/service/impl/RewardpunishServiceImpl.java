package com.lc.service.impl;

import com.lc.dao.RewardpunishMapper;
import com.lc.entity.Rewardpunish;
import com.lc.enums.ResultEnum;
import com.lc.service.RewardpunishService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RewardpunishServiceImpl implements RewardpunishService {

    @Autowired
    private RewardpunishMapper rewardpunishMapper;

    @Override
    public ResultVO insertRewardpunish(Rewardpunish rewardpunish) {
        Date date = new Date();
        rewardpunish.setRewardpunishTime(date);
        int insert = rewardpunishMapper.insertSelective(rewardpunish);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("添加成功");
    }

    @Override
    public ResultVO selectRewardpunish() {
        List<Rewardpunish> rewardpunishList = rewardpunishMapper.selectAll();
        if(rewardpunishList == null){
            return ResultVOUtil.error(ResultEnum.REWARDPUNISH_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(rewardpunishList);
    }

    @Override
    public ResultVO deleteRewardpunish(Long rewardpunishid) {
        int delete = rewardpunishMapper.deleteByPrimaryKey(rewardpunishid);
        if(delete != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("删除成功");
    }

    @Override
    public ResultVO updateRewardpunish(Long rewardpunishid, Integer rewardpunishState, String rewardpunishDescription, Integer grade) {
        Rewardpunish rewardpunish = rewardpunishMapper.selectByPrimaryKey(rewardpunishid);
        if(rewardpunish == null){
            return ResultVOUtil.error(ResultEnum.REWARDPUNISH_NOT_EXIST_ERROR);
        }
        rewardpunish.setRewardpunishState(rewardpunishState);
        rewardpunish.setRewardpunishDescription(rewardpunishDescription);
        rewardpunish.setGrade(grade);
        int update = rewardpunishMapper.updateByPrimaryKeySelective(rewardpunish);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("修改成功");
    }

    @Override
    public ResultVO selectRewardpunishByNickname(String nickname) {
        List<Rewardpunish> rewardpunishList = rewardpunishMapper.selectByNickname(nickname);
        if(rewardpunishList == null){
            return ResultVOUtil.error(ResultEnum.REWARDPUNISH_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(rewardpunishList);
    }
}
