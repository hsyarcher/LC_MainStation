package com.lc.service.impl;

import com.lc.dao.HomeMapper;
import com.lc.dao.UserMapper;
import com.lc.entity.Home;
import com.lc.entity.User;
import com.lc.enums.ResultEnum;
import com.lc.form.LoginForm;
import com.lc.form.RegisterForm;
import com.lc.form.UpdatePasswordForm;
import com.lc.service.UserService;
import com.lc.utils.MD5Utils;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HomeMapper homeMapper;

    // 用户注册
    @Override
    public ResultVO register(RegisterForm registerForm) {
        User user = new User();
        user = userMapper.selectByUsername(registerForm.getUsername());
        if(user != null){
            return ResultVOUtil.error(ResultEnum.USER_EXIST_ERROR);
        }
        // 赋值
        user = new User();
        BeanUtils.copyProperties(registerForm,user);
        // 密码加密
        user.setPassword(MD5Utils.code(user.getPassword()));
        user.setRole(0);
        Date date = new Date();
        user.setCreateTime(date);

        // 存入数据库
        int insert = userMapper.insertSelective(user);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        user = userMapper.selectByUsername(registerForm.getUsername());
        Home home = new Home();
        home.setUserid(user.getUserid());
        insert = homeMapper.insertSelective(home);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("注册成功");
    }

    // 用户登录
    @Override
    public ResultVO login(LoginForm loginForm) {
        User user = userMapper.selectByUsername(loginForm.getUsername());
        if(user == null){
            return ResultVOUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        }
        if(!(user.getPassword().equals(MD5Utils.code(loginForm.getPassword())))){
            return ResultVOUtil.error(ResultEnum.PASSWORD_ERROR);
        }
        Date date = new Date();
        // 登录时间修改
        user.setLastLoginTime(date);
        // 存入数据库
        int update = userMapper.updateByPrimaryKeySelective(user);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success(user);
    }

    // 用户修改密码
    @Override
    public ResultVO update(UpdatePasswordForm updatePasswordForm) {
        User user = userMapper.selectByPrimaryKey(updatePasswordForm.getUserid());
        if(user == null){
            return ResultVOUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        }
        if(!(user.getPassword().equals(MD5Utils.code(updatePasswordForm.getPassword())))){
            return ResultVOUtil.error(ResultEnum.PASSWORD_ERROR);
        }
        user.setPassword(MD5Utils.code(updatePasswordForm.getNewPassword()));
        Date date = new Date();
        // 修改时间改变
        user.setUpdateTime(date);
        // 存入数据库
        int update = userMapper.updateByPrimaryKeySelective(user);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("修改成功");
    }
}
