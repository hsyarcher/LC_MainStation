package com.lc.entity;

import java.util.Date;

public class Feedback {
    private Long feedbackid;

    private String feedback;

    private Date feedbackTime;

    public Long getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(Long feedbackid) {
        this.feedbackid = feedbackid;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackid=" + feedbackid +
                ", feedback='" + feedback + '\'' +
                ", feedbackTime=" + feedbackTime +
                '}';
    }
}