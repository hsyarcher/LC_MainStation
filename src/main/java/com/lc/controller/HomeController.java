package com.lc.controller;

import com.lc.form.HomeForm;
import com.lc.service.HomeService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lc/user/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    // 修改空间
    @PutMapping("/update")
    public ResultVO updateHome(HomeForm homeForm){
        return homeService.updateHome(homeForm);
    }

    // 查看空间
    @GetMapping("/select")
    public ResultVO selectHome(Long userid){
        return homeService.selectHome(userid);
    }

}
