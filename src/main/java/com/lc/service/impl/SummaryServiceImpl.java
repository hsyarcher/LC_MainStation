package com.lc.service.impl;

import com.lc.dao.SummaryMapper;
import com.lc.entity.Summary;
import com.lc.enums.ResultEnum;
import com.lc.service.SummaryService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SummaryServiceImpl implements SummaryService {

    @Autowired
    private SummaryMapper summaryMapper;

    // 添加个人总结
    @Override
    public ResultVO addSummary(Summary summary) {
        Date date = new Date();
        summary.setSummaryTime(date);
        int insert = summaryMapper.insertSelective(summary);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("添加成功");
    }

    // 修改个人总结
    @Override
    public ResultVO updateSummary(Long summaryid, String summaryTitle, String summaryDetail) {
        Summary summary = summaryMapper.selectByPrimaryKey(summaryid);
        if(summary == null){
            return ResultVOUtil.error(ResultEnum.SUMMARY_NOT_EXIST_ERROR);
        }
        summary.setSummaryTitle(summaryTitle);
        summary.setSummaryDetail(summaryDetail);
        Date date = new Date();
        summary.setSummaryTime(date);
        int update = summaryMapper.updateByPrimaryKeySelective(summary);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("修改成功");
    }

    // 删除个人总结
    @Override
    public ResultVO deleteSummary(Long summaryid) {
        int delete = summaryMapper.deleteByPrimaryKey(summaryid);
        if(delete != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("删除成功");
    }
}
