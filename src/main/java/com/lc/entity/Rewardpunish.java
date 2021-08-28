package com.lc.entity;

import java.util.Date;

public class Rewardpunish {
    private Long rewardpunishid;

    private String nickname;

    private Integer grade;

    private Integer rewardpunishState;

    private String rewardpunishDescription;

    private Date rewardpunishTime;

    public Long getRewardpunishid() {
        return rewardpunishid;
    }

    public void setRewardpunishid(Long rewardpunishid) {
        this.rewardpunishid = rewardpunishid;
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

    public Integer getRewardpunishState() {
        return rewardpunishState;
    }

    public void setRewardpunishState(Integer rewardpunishState) {
        this.rewardpunishState = rewardpunishState;
    }

    public String getRewardpunishDescription() {
        return rewardpunishDescription;
    }

    public void setRewardpunishDescription(String rewardpunishDescription) {
        this.rewardpunishDescription = rewardpunishDescription;
    }

    public Date getRewardpunishTime() {
        return rewardpunishTime;
    }

    public void setRewardpunishTime(Date rewardpunishTime) {
        this.rewardpunishTime = rewardpunishTime;
    }

    @Override
    public String toString() {
        return "Rewardpunish{" +
                "rewardpunishid=" + rewardpunishid +
                ", nickname='" + nickname + '\'' +
                ", grade=" + grade +
                ", rewardpunishState=" + rewardpunishState +
                ", rewardpunishDescription='" + rewardpunishDescription + '\'' +
                ", rewardpunishTime=" + rewardpunishTime +
                '}';
    }
}