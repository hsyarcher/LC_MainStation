package com.lc.service.impl;

import com.lc.dao.GoalMapper;
import com.lc.dao.UserMapper;
import com.lc.entity.Goal;
import com.lc.entity.User;
import com.lc.enums.ResultEnum;
import com.lc.service.GoalService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalMapper goalMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVO insertGoal(String goalContent, Long userid, Integer goalState) {
        User user = userMapper.selectByPrimaryKey(userid);
        if(user == null){
            return ResultVOUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        }
        Goal goal = new Goal();
        Date date = new Date();
        goal.setGoalContent(goalContent);
        goal.setUserid(user.getUserid());
        goal.setUsername(user.getUsername());
        goal.setGoalTime(date);
        goal.setGoalState(goalState);
        int insert = goalMapper.insertSelective(goal);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("添加成功");
    }

    @Override
    public ResultVO selectGoal() {
        List<Goal> goalList = goalMapper.selectAll();
        if(goalList == null){
            return ResultVOUtil.error(ResultEnum.GOAL_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(goalList);
    }

    @Override
    public ResultVO updateGoal(Long goalid, Integer goalState) {
        Goal goal = goalMapper.selectByPrimaryKey(goalid);
        if(goal == null){
            return ResultVOUtil.error(ResultEnum.GOAL_NOT_EXIST_ERROR);
        }
        Date date = new Date();
        goal.setGoalTime(date);
        goal.setGoalState(goalState);
        int update = goalMapper.updateByPrimaryKeySelective(goal);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("修改成功");
    }

    @Override
    public ResultVO selectGoalByid(Long userid) {
        List<Goal> goalList = goalMapper.selectByUserid(userid);
        if(goalList == null){
            return ResultVOUtil.error(ResultEnum.GOAL_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(goalList);
    }
}
