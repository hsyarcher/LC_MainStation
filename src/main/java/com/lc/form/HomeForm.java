package com.lc.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class HomeForm {
    @NotEmpty(message = "id不能为空")
    private Long userid;
    private String nickname;
    private Integer grade;
    private String phone;
    private String email;
    private String avatar;
    private Integer role;
    private String selfIntroduction;
}
