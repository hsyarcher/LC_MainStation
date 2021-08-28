package com.lc.service.impl;

import com.lc.dao.UserMapper;
import com.lc.entity.User;
import com.lc.enums.ResultEnum;
import com.lc.service.ManageService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import com.lc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private UserMapper userMapper;

    // 管理员查看所有用户
    @Override
    public ResultVO selectUser() {
        List<UserVO> userVOList = userMapper.selectAll();
        if(userVOList == null){
            return ResultVOUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(userVOList);
    }

    // 管理员修改用户信息
    @Override
    public ResultVO updateUser(UserVO userVO) {
        User user = userMapper.selectByPrimaryKey(userVO.getUserid());
        if(user == null){
            return ResultVOUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        }
        user.setNickname(userVO.getNickname());
        user.setGrade(userVO.getGrade());
        user.setPhone(userVO.getPhone());
        user.setEmail(userVO.getEmail());
        user.setAvatar(userVO.getAvatar());
        user.setRole(userVO.getRole());
        Date date = new Date();
        user.setUpdateTime(date);
        // 存入数据库
        int update = userMapper.updateByPrimaryKeySelective(user);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("修改成功");
    }

    // 管理员删除用户
    @Override
    public ResultVO deleteUser(Long userid) {
        User user = userMapper.selectByPrimaryKey(userid);
        if(user == null){
            return ResultVOUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        }
        int delete = userMapper.deleteByPrimaryKey(userid);
        if(delete != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("删除成功");
    }
}
