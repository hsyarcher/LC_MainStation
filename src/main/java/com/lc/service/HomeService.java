package com.lc.service;

import com.lc.form.HomeForm;
import com.lc.vo.ResultVO;

public interface HomeService {

    // 修改空间
    ResultVO updateHome(HomeForm homeForm);

    // 查看空间
    ResultVO selectHome(Long userid);
}
