package com.mstatic.paper.resp;

public class Response<T> {

    public static final int RESP_SUCCESS = 0x00;
    public static final int RESP_ERR = 0x01;

    private int code;
    private String messge;
    private T data;

    public Response(int code, String messge) {
        this.code = code;
        this.messge = messge;
    }

    public Response(int code, String message, T data) {
        this.code = code;
        this.messge = message;
        this.data = data;
    }


    public static <T> Response getDefaultSuccessResp(String msg, T data) {
        if (msg == null || msg.isEmpty()) {
            msg = "操作成功";
        }
        return new Response(RESP_SUCCESS, msg, data);
    }

    public static <T> Response getDefaultSuccessResp( T data) {
        return getDefaultSuccessResp(null, data);
    }

    public static Response getDefaultSuccessResp(String msg) {
        return getDefaultSuccessResp(msg, null);
    }

    public static Response getDefaultSuccessResp() {
        return getDefaultSuccessResp(null, null);
    }



    public static <T> Response getDefaultErrResp(String msg, T data) {
        if (msg == null || msg.isEmpty()) {
            msg = "操作失败";
        }
        return new Response(RESP_ERR, msg);
    }

    public static <T> Response getDefaultErrResp(String msg) {
        return getDefaultErrResp(msg, null);
    }

    public static <T> Response getDefaultErrResp() {
        return getDefaultErrResp(null, null);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
