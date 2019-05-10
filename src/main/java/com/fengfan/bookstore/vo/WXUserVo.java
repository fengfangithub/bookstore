package com.fengfan.bookstore.vo;

/**
 * @ClassName WXUserVo
 * @Author fengfan
 * @Date 2019/4/17 15:33
 * @Description TODO
 * @Version 1.0
 **/
public class WXUserVo {
    private String session_key;
    private String openid;

    public WXUserVo() {
    }

    public WXUserVo(String session_key, String openid) {
        this.session_key = session_key;
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
