package com.example.blog.common;


import com.example.blog.common.enums.ExceptionMsgEnum;

public class ResultUtil {

    public static Result getResult(ExceptionMsgEnum emenum){
        return getResult(emenum.getValue(),emenum.getDesc(),false);
    }

    public static Result ok(){
        return ok(null);
    }

    public static Result error(){
        return error(400);
    }

    public static Result error(int code){
        return getResult(code,"",false);
    }

    public static Result ok(Object data){
        return getResult(200,"",true,data);
    }

    public static Result getResult(int code, String msg,boolean isSuccess){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setSuccess(isSuccess);
        return r;
    }
    public static Result getResult(int code,String msg,boolean isSuccess, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setSuccess(isSuccess);
        r.setData(data);
        return r;
    }
}
