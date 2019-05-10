package com.fengfan.bookstore.controller;

import com.alibaba.fastjson.JSON;
import com.fengfan.bookstore.entity.UserEntity;
import com.fengfan.bookstore.service.UserService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.tool.WXUtil;
import com.fengfan.bookstore.vo.PayVo;
import com.fengfan.bookstore.vo.UserVo;
import com.fengfan.bookstore.vo.WXUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName UserController
 * @Author fengfan
 * @Date 2019/4/18 11:06
 * @Description TODO
 * @Version 1.0
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public BaseResponse<UserVo> login(String code, HttpServletRequest request) {
        try {
            WXUserVo wxUserVo = WXUtil.loginCheck(code);
            UserVo userVo = userService.queryUser(wxUserVo.getOpenid());
            HttpSession session = request.getSession();
            session.setAttribute("openID", wxUserVo.getOpenid());
            if (userVo.getId() != 0) {
                return new BaseResponse<>(StatusCode.USER_LOGIN_SUCCESS, userVo);
            }
            return new BaseResponse<>(StatusCode.USER_LOGIN_EXIST, userVo);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/query")
    @ResponseBody
    public BaseResponse<UserVo> queryUserInfo(HttpServletRequest request) {
        try {
            HttpSession session = request.getSession();
            String openID = session.getAttribute("openID").toString();
            UserVo userVo = userService.queryUser(openID);
            if (userVo.getId() != 0) {
                return new BaseResponse<>(StatusCode.USER_LOGIN_SUCCESS, userVo);
            }
            return new BaseResponse<>(StatusCode.USER_LOGIN_EXIST, userVo);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/add")
    @ResponseBody
    public BaseResponse<UserVo> addUser(UserEntity userEntity, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String openID = session.getAttribute("openID").toString();
        userEntity.setOpenID(openID);
        try {
            UserVo userVo = userService.insertUser(userEntity, openID);
            if (userVo != null) {
                return new BaseResponse<>(StatusCode.USER_ADD_SUCCESS, userVo);
            }
            return new BaseResponse<>(StatusCode.USER_ADD_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/pay-wx")
    @ResponseBody
    public BaseResponse payWX(@RequestBody String jsonData) {
        try {
            System.out.println(jsonData);
            List<PayVo> payVoList = JSON.parseArray(jsonData,PayVo.class);
            System.out.println(payVoList.size());
            int result = userService.pay(payVoList);
            if(result == 0){
                return new BaseResponse(StatusCode.USER_PAY_PASSWORD_FAIL);
            }else if(result == payVoList.size()){
                return new BaseResponse(StatusCode.USER_PAY_SUCCESS);
            }else{
                return new BaseResponse(StatusCode.USER_PAY_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/pay")
    @ResponseBody
    public BaseResponse pay(@RequestBody String jsonData) {
        try {
            List<PayVo> payVoList = JSON.parseArray(jsonData,PayVo.class);
            int result = userService.pay(payVoList);
            System.out.println(result);
            if(result == 0){
                return new BaseResponse(StatusCode.USER_PAY_PASSWORD_FAIL);
            }else if(result == payVoList.size()){
                return new BaseResponse(StatusCode.USER_PAY_SUCCESS);
            }else{
                return new BaseResponse(StatusCode.USER_PAY_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/recharge")
    @ResponseBody
    public BaseResponse recharge(int userID, BigDecimal money, String wxPassword) {
        try {
            int result = userService.recharge(userID, money, wxPassword);
            if (result == 0) {
                return new BaseResponse(StatusCode.USER_RECHARGE_PASSWORD_FAIL);
            }
            if (result == 1) {
                return new BaseResponse(StatusCode.USER_RECHARGE_SUCCESS);
            }
            return new BaseResponse(StatusCode.USER_RECHARGE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/convert")
    @ResponseBody
    public BaseResponse convert(int userID) {
        return null;
    }

}
