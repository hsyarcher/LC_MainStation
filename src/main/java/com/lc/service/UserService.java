package com.lc.service;

import com.lc.form.LoginForm;
import com.lc.form.RegisterForm;
import com.lc.form.UpdatePasswordForm;
import com.lc.vo.ResultVO;

public interface UserService {

    // 用户注册
    ResultVO register(RegisterForm registerForm);

    // 用户登录
    ResultVO login(LoginForm loginForm);

    // 用户修改密码
    ResultVO update(UpdatePasswordForm updatePasswordForm);
}
