package com.lc.controller;

import com.lc.entity.Notice;
import com.lc.form.NoticeForm;
import com.lc.service.NoticeService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lc")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    // 管理员添加公告
    @PostMapping("/manage/notice/insert")
    public ResultVO insertNotice(NoticeForm noticeForm){
        return noticeService.insertNotice(noticeForm);
    }

    // 用户查看公告
    @GetMapping("/user/notice/select")
    public ResultVO selectNotice(){
        return noticeService.selectNotice();
    }

    // 管理员删除公告
    @DeleteMapping("/manage/notice/delete")
    public ResultVO deleteNotice(Long noticeid){
        return noticeService.deleteNotice(noticeid);
    }
}
