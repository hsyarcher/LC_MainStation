package com.lc.service;

import com.lc.entity.Feedback;
import com.lc.vo.ResultVO;

public interface FeedbackService {

    // 提交反馈
    ResultVO insertFeedback(String feedback);

    // 查看反馈
    ResultVO selectFeedback();
}
