package com.lc.entity;

import java.util.Date;

public class Goal {
    private Long goalid;

    private String goalContent;

    private Long userid;

    private String username;

    private Date goalTime;

    private Integer goalState;

    public Long getGoalid() {
        return goalid;
    }

    public void setGoalid(Long goalid) {
        this.goalid = goalid;
    }

    public String getGoalContent() {
        return goalContent;
    }

    public void setGoalContent(String goalContent) {
        this.goalContent = goalContent;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getGoalTime() {
        return goalTime;
    }

    public void setGoalTime(Date goalTime) {
        this.goalTime = goalTime;
    }

    public Integer getGoalState() {
        return goalState;
    }

    public void setGoalState(Integer goalState) {
        this.goalState = goalState;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "goalid=" + goalid +
                ", goalContent='" + goalContent + '\'' +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", goalTime=" + goalTime +
                ", goalState=" + goalState +
                '}';
    }
}