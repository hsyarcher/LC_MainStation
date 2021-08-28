package com.lc.entity;

import java.util.Date;

public class Bill {
    private Long billid;

    private String nickname;

    private Integer grade;

    private String billDescribe;

    private String billType;

    private Integer billMoney;

    private Date billTime;

    public Long getBillid() {
        return billid;
    }

    public void setBillid(Long billid) {
        this.billid = billid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getBillDescribe() {
        return billDescribe;
    }

    public void setBillDescribe(String billDescribe) {
        this.billDescribe = billDescribe;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public Integer getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Integer billMoney) {
        this.billMoney = billMoney;
    }

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billid=" + billid +
                ", nickname='" + nickname + '\'' +
                ", grade=" + grade +
                ", billDescribe='" + billDescribe + '\'' +
                ", billType='" + billType + '\'' +
                ", billMoney=" + billMoney +
                ", billTime=" + billTime +
                '}';
    }
}