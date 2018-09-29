package com.qfedu.vo;

import java.util.List;

public class ReVo <T>{
    private int code;

    private String msg;

    private List<T> data;

    public ReVo() {
    }

    public ReVo(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
