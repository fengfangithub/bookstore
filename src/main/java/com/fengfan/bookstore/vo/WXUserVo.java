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
    private String open_id;

    public WXUserVo(String session_key, String open_id) {
        this.session_key = session_key;
        this.open_id = open_id;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }
}
