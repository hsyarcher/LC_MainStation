package com.lc.controller;

import com.lc.form.LoginForm;
import com.lc.form.RegisterForm;
import com.lc.form.UpdatePasswordForm;
import com.lc.service.UserService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lc/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResultVO register(RegisterForm registerForm){
        return userService.register(registerForm);
    }

    @PostMapping("/login")
    public ResultVO login(LoginForm loginForm){
        return userService.login(loginForm);
    }

    @PutMapping("/update")
    public ResultVO update(UpdatePasswordForm updatePasswordForm){
        return userService.update(updatePasswordForm);
    }
}
