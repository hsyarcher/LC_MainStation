package com.lc.entity;

import java.util.Date;

public class Notice {
    private Long noticeid;

    private String noticeTitle;

    private String noticeContent;

    private Date noticeTime;

    private String noticeImg;

    public Long getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Long noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticeImg() {
        return noticeImg;
    }

    public void setNoticeImg(String noticeImg) {
        this.noticeImg = noticeImg;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeid=" + noticeid +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeTime=" + noticeTime +
                ", noticeImg='" + noticeImg + '\'' +
                '}';
    }
}