package com.lc.controller;

import com.lc.entity.Summary;
import com.lc.service.SummaryService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lc/user/summary")
public class SummaryController {

    @Autowired
    private SummaryService summaryService;

    // 添加个人总结
    @PostMapping("/add")
    public ResultVO addSummary(Summary summary){
        return summaryService.addSummary(summary);
    }

    // 修改个人总结
    @PutMapping("/update")
    public ResultVO updateSummary(Long summaryid,String summaryTitle,String summaryDetail){
        return summaryService.updateSummary(summaryid, summaryTitle, summaryDetail);
    }

    // 删除个人总结
    @DeleteMapping("/delete")
    public ResultVO deleteSummary(Long summaryid){
        return summaryService.deleteSummary(summaryid);
    }
}
