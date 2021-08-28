package com.lc.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVO {
    private Long userid;
    private String username;
    private String nickname;
    private Integer grade;
    private String phone;
    private String email;
    private String avatar;
    private Integer role;
    private Date createTime;
    private Date lastLoginTime;
}
