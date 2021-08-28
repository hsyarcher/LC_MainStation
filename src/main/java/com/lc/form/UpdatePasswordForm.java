package com.lc.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class UpdatePasswordForm {
    @NotEmpty(message = "id不能为空")
    private Long userid;
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotBlank(message = "新密码不能为空")
    private String newPassword;
}
