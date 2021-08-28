package com.lc.entity;

import java.util.Date;

public class Summary {
    private Long summaryid;

    private Long userid;

    private String summaryTitle;

    private String summaryDetail;

    private Date summaryTime;

    public Long getSummaryid() {
        return summaryid;
    }

    public void setSummaryid(Long summaryid) {
        this.summaryid = summaryid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getSummaryTitle() {
        return summaryTitle;
    }

    public void setSummaryTitle(String summaryTitle) {
        this.summaryTitle = summaryTitle;
    }

    public String getSummaryDetail() {
        return summaryDetail;
    }

    public void setSummaryDetail(String summaryDetail) {
        this.summaryDetail = summaryDetail;
    }

    public Date getSummaryTime() {
        return summaryTime;
    }

    public void setSummaryTime(Date summaryTime) {
        this.summaryTime = summaryTime;
    }
}