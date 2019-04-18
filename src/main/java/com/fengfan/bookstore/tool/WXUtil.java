package com.fengfan.bookstore.tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fengfan.bookstore.vo.WXUserVo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName WXUtil
 * @Author fengfan
 * @Date 2019/4/17 12:30
 * @Description TODO
 * @Version 1.0
 **/
public class WXUtil {
    private static final String APPID = "wxa27501b80c7b878e";
    private static final String SECRET = "56cd6f5066a5bc9a17d91df030b170af";

    public static WXUserVo loginCheck(String code) throws Exception {
        URL url = new URL("https://api.weixin.qq.com/sns/jscode2session?appid="
                + APPID + "&secret=" + SECRET + "&js_code=" + code + "&grant_type=authorization_code");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String str;
        while ((str = in.readLine()) != null) {
            sb.append(str);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        WXUserVo wxUserVo = objectMapper.readValue(sb.toString(), WXUserVo.class);
        return wxUserVo;
    }

}
