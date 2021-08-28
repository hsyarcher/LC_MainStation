package com.lc.service;

import com.lc.vo.ResultVO;
import com.lc.vo.UserVO;

public interface ManageService {

    // 管理员查看所有用户
    ResultVO selectUser();

    // 管理员修改用户信息
    ResultVO updateUser(UserVO userVO);

    // 管理员删除用户
    ResultVO deleteUser(Long userid);
}
