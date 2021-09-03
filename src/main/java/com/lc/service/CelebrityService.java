package com.lc.service;

import com.lc.entity.Celebrity;
import com.lc.vo.ResultVO;
import org.springframework.stereotype.Service;

public interface CelebrityService {

    // 管理员添加名人榜
    ResultVO insertCelebrity(Celebrity celebrity);

    // 用户查看名人榜
    ResultVO selectAllCelebrity();

    // 管理员修改名人信息
    ResultVO updateCelebrity(Celebrity celebrity);

    // 管理员删除名人信息
    ResultVO deleteCelebrity(Long celebrityid);

}
