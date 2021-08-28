package com.lc.entity;

public class Celebrity {
    private Long celebrityid;

    private String celebrityName;

    private String celebrityPhoto;

    private String celebrityIntroduction;

    private String celebrityTalk;

    public Long getCelebrityid() {
        return celebrityid;
    }

    public void setCelebrityid(Long celebrityid) {
        this.celebrityid = celebrityid;
    }

    public String getCelebrityName() {
        return celebrityName;
    }

    public void setCelebrityName(String celebrityName) {
        this.celebrityName = celebrityName;
    }

    public String getCelebrityPhoto() {
        return celebrityPhoto;
    }

    public void setCelebrityPhoto(String celebrityPhoto) {
        this.celebrityPhoto = celebrityPhoto;
    }

    public String getCelebrityIntroduction() {
        return celebrityIntroduction;
    }

    public void setCelebrityIntroduction(String celebrityIntroduction) {
        this.celebrityIntroduction = celebrityIntroduction;
    }

    public String getCelebrityTalk() {
        return celebrityTalk;
    }

    public void setCelebrityTalk(String celebrityTalk) {
        this.celebrityTalk = celebrityTalk;
    }

    @Override
    public String toString() {
        return "Celebrity{" +
                "celebrityid=" + celebrityid +
                ", celebrityName='" + celebrityName + '\'' +
                ", celebrityPhoto='" + celebrityPhoto + '\'' +
                ", celebrityIntroduction='" + celebrityIntroduction + '\'' +
                ", celebrityTalk='" + celebrityTalk + '\'' +
                '}';
    }
}