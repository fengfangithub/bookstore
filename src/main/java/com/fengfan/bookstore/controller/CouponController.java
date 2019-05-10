package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.CouponEntity;
import com.fengfan.bookstore.service.CouponService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.CouponVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @ClassName CouponController
 * @Author fengfan
 * @Date 2019/4/23 16:38
 * @Description TODO
 * @Version 1.0
 **/
@Controller
@RequestMapping("/coupon")
@ResponseBody
public class CouponController {

    @Autowired
    private CouponService couponService;

    @RequestMapping("/list")
    public BaseResponse<CouponVo> getCoupon(int userID) {
        try {
            return new BaseResponse<>(StatusCode.COUPON_QUERY_SUCCESS, couponService.queryCouponGain(userID));
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/redemption")
    public BaseResponse<List<CouponEntity>> couponList() {
        try {
            return new BaseResponse<>(StatusCode.COUPON_QUERY_SUCCESS, couponService.queryCoupon());
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/add")
    public BaseResponse addCoupon(int userID, int couponID, int duration) {
        try {
            int result = couponService.insertCouponGain(userID, couponID, duration);
            if (result == 1) {
                return new BaseResponse(StatusCode.COUPON_INSERT_SUCCESS);
            } else {
                return new BaseResponse(StatusCode.COUPON_INSERT_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }


}
