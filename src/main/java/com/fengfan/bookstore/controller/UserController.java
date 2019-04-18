package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.UserEntity;
import com.fengfan.bookstore.service.UserService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

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
//          WXUserVo wxUserVo = WXUtil.loginCheck(code);
            UserVo userVo = userService.queryUser(code);
            HttpSession session = request.getSession();
            session.setAttribute("openID", code);
            userVo.setJESESSIONID(session.getId());
            if (userVo.getId() != 0) {
                return new BaseResponse<>(StatusCode.USER_LOGIN_SUCCESS, userVo);
            }
            userVo.setOpenID(session.getAttribute("openID").toString());
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
        try {
            UserVo userVo = userService.insertUser(userEntity, session.getAttribute("openId").toString());
            if (userVo != null) {
                userVo.setJESESSIONID(session.getId());
                return new BaseResponse<>(StatusCode.USER_ADD_SUCCESS, userVo);
            }
            return new BaseResponse<>(StatusCode.USER_ADD_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/recharge")
    @ResponseBody
    public BaseResponse recharge(int userID, BigDecimal balance) {
        try {
            int result = userService.updateBalance(userID, balance);
            if (result == 1) {
                return new BaseResponse(StatusCode.USER_RECHARGE_SUCCESS);
            }
            return new BaseResponse(StatusCode.USER_RECHARGE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/pay")
    @ResponseBody
    public BaseResponse pay(int userID, BigDecimal balance) {
        try {
            int result = userService.updateBalance(userID, balance.negate());
            if (result == 1) {
                return new BaseResponse(StatusCode.USER_PAY_SUCCESS);
            }
            return new BaseResponse(StatusCode.USER_PAY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/add_points")
    @ResponseBody
    public BaseResponse addPoints(int userID, int points) {
        try {
            int result = userService.updatePoints(userID, points);
            if (result == 1) {
                return new BaseResponse(StatusCode.USER_ADD_POINTS_SUCCESS);
            }
            return new BaseResponse(StatusCode.USER_ADD_POINTS_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/subtract_points")
    @ResponseBody
    public BaseResponse subtractPoints(int userID, int points) {
        try {
            int result = userService.updatePoints(userID, -points);
            if (result == 1) {
                return new BaseResponse(StatusCode.USER_SUBTRACT_POINTS_SUCCESS);
            }
            return new BaseResponse(StatusCode.USER_SUBTRACT_POINTS_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }
}
