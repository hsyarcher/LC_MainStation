package com.lc.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class NoticeForm {
    private String noticeTitle;
    @NotBlank(message = "内容不能为空")
    private String noticeContent;
    private String noticeImg;
}
