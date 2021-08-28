package com.lc.controller;

import com.lc.service.GoalService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lc/user/goal")
public class GoalController {

    @Autowired
    private GoalService goalService;

    // 添加心愿
    @PostMapping("/insert")
    public ResultVO insertGoal(String goalContent,Long userid,Integer goalState){
        return goalService.insertGoal(goalContent,userid,goalState);
    }

    // 查看心愿
    @GetMapping("/select")
    public ResultVO selectGoal(){
        return goalService.selectGoal();
    }

    // 修改心愿
    @PutMapping("/update")
    public ResultVO updateGoal(Long goalid,Integer goalState){
        return goalService.updateGoal(goalid,goalState);
    }

    // 根据用户id查看心愿
    @GetMapping("/selectbyid")
    public ResultVO selectGoalByid(Long userid){
        return goalService.selectGoalByid(userid);
    }
}
