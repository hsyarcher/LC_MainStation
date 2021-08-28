package com.lc.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    USER_EXIST_ERROR(1,"用户已存在"),
    DATABASE_OPTION_ERROR(2,"数据库操作失败"),
    USER_NOT_EXIST_ERROR(3,"用户不存在"),
    PASSWORD_ERROR(4,"密码错误"),
    CELEBRITY_NOT_EXIST_ERROR(5,"名人未添加"),
    FEEDBACK_NOT_EXIST_ERROR(6,"没有反馈信息"),
    NOTICE_NOT_EXIST_ERROR(7,"公告不存在"),
    GOAL_NOT_EXIST_ERROR(8,"心愿不存在"),
    SUMMARY_NOT_EXIST_ERROR(9,"总结不存在"),
    BILL_NOT_EXIST_ERROR(10,"账单不存在"),
    REWARDPUNISH_NOT_EXIST_ERROR(11,"奖惩不存在"),


    AUTHENTICATION_ERROR(401, "用户认证失败,请重新登录"),
    PERMISSION_DENNY(403, "权限不足"),
    NOT_FOUND(404, "url错误,请求路径未找到"),
    SERVER_ERROR(500, "服务器未知错误:%s"),
    BIND_ERROR(511, "参数校验错误:%s"),
    REQUEST_METHOD_ERROR(550, "不支持%s的请求方式");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
