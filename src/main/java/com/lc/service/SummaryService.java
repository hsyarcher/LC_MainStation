package com.lc.service;

import com.lc.entity.Summary;
import com.lc.vo.ResultVO;

public interface SummaryService {

    // 添加个人总结
    ResultVO addSummary(Summary summary);

    // 修改个人总结
    ResultVO updateSummary(Long summaryid,String summaryTitle,String summaryDetail);

    // 删除个人总结
    ResultVO deleteSummary(Long summaryid);
}
