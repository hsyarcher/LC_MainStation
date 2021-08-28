package com.lc.service;

import com.lc.form.NoticeForm;
import com.lc.vo.ResultVO;

public interface NoticeService {

    // 管理员添加公告
    ResultVO insertNotice(NoticeForm noticeForm);

    // 用户查看公告
    ResultVO selectNotice();

    // 管理员删除公告
    ResultVO deleteNotice(Long noticeid);
}
