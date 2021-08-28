package com.lc.controller;

import com.lc.entity.Celebrity;
import com.lc.service.CelebrityService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lc")
public class CelebrityController {

    @Autowired
    private CelebrityService celebrityService;

    // 管理员添加名人榜
    @PostMapping("/manage/celebrity/insert")
    public ResultVO insertCelebrity(Celebrity celebrity){
        return celebrityService.insertCelebrity(celebrity);
    }

    // 用户查看名人榜
    @GetMapping("/user/celebrity/select")
    public ResultVO selectAllCelebrity(){
        return celebrityService.selectAllCelebrity();
    }

    // 管理员修改名人信息
    @PutMapping("/manage/celebrity/update")
    public ResultVO updateCelebrity(Celebrity celebrity){
        return celebrityService.updateCelebrity(celebrity);
    }

    // 管理员删除名人信息
    @DeleteMapping("/manage/celebrity/delete")
    public ResultVO deleteCelebrity(Long celebrityid){
        return celebrityService.deleteCelebrity(celebrityid);
    }
}
