package com.lc.service;

import com.lc.vo.ResultVO;

public interface GoalService {

    // 添加心愿
    ResultVO insertGoal(String goalContent,Long userid,Integer goalState);

    // 查看心愿
    ResultVO selectGoal();

    // 修改心愿状态
    ResultVO updateGoal(Long goalid,Integer goalState);

    // 根据用户id查看心愿
    ResultVO selectGoalByid(Long userid);
}
