package com.lc.service.impl;

import com.lc.dao.NoticeMapper;
import com.lc.entity.Notice;
import com.lc.enums.ResultEnum;
import com.lc.form.NoticeForm;
import com.lc.service.NoticeService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    // 管理员添加公告
    @Override
    public ResultVO insertNotice(NoticeForm noticeForm) {
        Notice notice = new Notice();
        BeanUtils.copyProperties(noticeForm,notice);
        Date date = new Date();
        notice.setNoticeTime(date);
        int insert = noticeMapper.insertSelective(notice);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("添加成功");
    }

    // 用户查看公告
    @Override
    public ResultVO selectNotice() {
        List<Notice> noticeList = noticeMapper.selectAll();
        if(noticeList == null){
            return ResultVOUtil.error(ResultEnum.NOTICE_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(noticeList);
    }

    // 管理员删除公告
    @Override
    public ResultVO deleteNotice(Long noticeid) {
        Notice notice = noticeMapper.selectByPrimaryKey(noticeid);
        if(notice == null){
            return ResultVOUtil.error(ResultEnum.NOTICE_NOT_EXIST_ERROR);
        }
        int delete = noticeMapper.deleteByPrimaryKey(noticeid);
        if(delete != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("删除成功");
    }
}
