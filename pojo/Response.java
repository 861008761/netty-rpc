package com.phei.netty.rpc.pojo;

public class Response {
    private Object resp;

    public Object getResp() {
        return resp;
    }

    public void setResp(Object resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "Response[" + "resp: " + resp + "]";
    }
}
