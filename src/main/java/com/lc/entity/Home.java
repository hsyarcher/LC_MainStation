package com.lc.entity;

import java.util.List;

public class Home {
    private Long userid;

    private String nickname;

    private Integer grade;

    private String phone;

    private String email;

    private String avatar;

    private Integer role;

    private String selfIntroduction;

    private List<Summary> summaryList;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public List<Summary> getSummaryList() {
        return summaryList;
    }

    public void setSummaryList(List<Summary> summaryList) {
        this.summaryList = summaryList;
    }

    @Override
    public String toString() {
        return "Home{" +
                "userid=" + userid +
                ", nickname='" + nickname + '\'' +
                ", grade=" + grade +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role=" + role +
                ", selfIntroduction='" + selfIntroduction + '\'' +
                ", summaryList=" + summaryList +
                '}';
    }
}