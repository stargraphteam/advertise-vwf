package com.sunlands.advertise.core;

public class ADResponse {
    private Integer code;   // 状态码
    private String msg;     // 信息
    private Integer count;  // 总数
    private Object data;

    public ADResponse(){
    }

    public ADResponse(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

    public ADResponse setADResponse(Integer code, String message){
        this.code = code;
        this.msg = message;
        return this;
    }

    public ADResponse setADResponseData(Object data){
        this.data = data;
        return this;
    }

    public ADResponse ERROR(){
        this.code = 0;
        this.msg = "ERROR";
        return this;
    }

    public ADResponse SUCCESS(){
        this.code = 1;
        this.msg = "SUCCESS";
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String message) {
        this.msg = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
