package com.lc.controller;

import com.lc.entity.Feedback;
import com.lc.service.FeedbackService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lc/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    // 提交反馈
    @PostMapping("/insert")
    public ResultVO insertFeedback(String feedback){
        return feedbackService.insertFeedback(feedback);
    }

    // 查看反馈
    @GetMapping("/select")
    public ResultVO selectFeedback(){
        return feedbackService.selectFeedback();
    }
}
