package com.example.blog.common.enums;

public enum ExceptionMsgEnum {

    UNAUTHENTICATED(1001,"未登陆，请先登录"),
    INCORRECTCREDENTIAL(1003,"账户密码不正确"),
    LOCKEDACCOUNT(1004,"账户已锁定，请联系管理员"),
    AUTHORIZATION(1005,"无操作权限，请联系管理员"),
    AUTHENTICATION(1006,"授权失败"),
    UNAUTHORIZED(1007,"无操作权限,请联系管理员"),
    NOHANDLERFOUND(1008,"访问资源不存在"),
    UNKNOWNACCOUNT(1002, "未知账户"),
    OTHER(1009,"操作有误");


    private int value;

    private String desc;

    ExceptionMsgEnum(int value,String desc){
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
