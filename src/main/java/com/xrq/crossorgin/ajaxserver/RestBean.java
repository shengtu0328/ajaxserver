package com.xrq.crossorgin.ajaxserver;

public class RestBean {

    private String data;

    public RestBean(String get1_ok) {

        this.data = get1_ok;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
