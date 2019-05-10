package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.UserEntity;
import com.fengfan.bookstore.vo.PayVo;
import com.fengfan.bookstore.vo.UserVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName UserService
 * @Author fengfan
 * @Date 2019/4/17 16:22
 * @Description TODO
 * @Version 1.0
 **/

public interface UserService {

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 10:50
     * @Paran
     * @Description 用户登陆
     * @Exception
     **/
    UserVo queryUser(String code) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 13:14
     * @Paran
     * @Description 添加一个用户
     * @Exception
     **/
    UserVo insertUser(UserEntity userEntity, String openID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/22 19:43
     * @Paran
     * @Description 用户支付订单
     * @Exception
     **/
    int pay(List<PayVo> payVoList) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 10:08
     * @Paran
     * @Description 微信支付
     * @Exception
     **/
    int payWX(List<PayVo> payVoList) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 10:03
     * @Paran
     * @Description 充值
     * @Exception
     **/
    int recharge(int userID, BigDecimal money, String wxPassword) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 10:11
     * @Paran
     * @Description 兑换优惠券
     * @Exception
     **/
    int convert(int userID, int couponID) throws Exception;
}
