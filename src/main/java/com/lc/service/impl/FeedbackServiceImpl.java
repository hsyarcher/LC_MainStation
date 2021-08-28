package com.lc.service.impl;

import com.lc.dao.FeedbackMapper;
import com.lc.entity.Feedback;
import com.lc.enums.ResultEnum;
import com.lc.service.FeedbackService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;

    // 添加反馈
    @Override
    public ResultVO insertFeedback(String feedback) {
        Feedback feedback1 = new Feedback();
        feedback1.setFeedback(feedback);
        Date date = new Date();
        feedback1.setFeedbackTime(date);
        int insert = feedbackMapper.insertSelective(feedback1);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("添加成功");
    }

    // 查看反馈
    @Override
    public ResultVO selectFeedback() {
        List<Feedback> feedbackList = feedbackMapper.selectAll();
        if(feedbackList == null){
            return ResultVOUtil.error(ResultEnum.FEEDBACK_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(feedbackList);
    }
}
