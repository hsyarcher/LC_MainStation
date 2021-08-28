package com.lc.controller;

import com.lc.service.ManageService;
import com.lc.vo.ResultVO;
import com.lc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lc/manage/user")
public class ManageController {

    @Autowired
    private ManageService manageService;

    // 管理员查看所有用户
    @GetMapping("/select")
    public ResultVO selectUser(){
        return manageService.selectUser();
    }

    // 管理员修改用户信息
    @PutMapping("/update")
    public ResultVO updateUser(UserVO userVO){
        return manageService.updateUser(userVO);
    }

    // 管理员删除用户
    @DeleteMapping("/delete")
    public ResultVO deleteUser(Long userid){
        return manageService.deleteUser(userid);
    }
}
