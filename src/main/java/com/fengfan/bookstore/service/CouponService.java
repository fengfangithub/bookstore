package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.CouponEntity;
import com.fengfan.bookstore.entity.CouponsGainEntity;
import com.fengfan.bookstore.vo.CouponGainVo;
import com.fengfan.bookstore.vo.CouponVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName CouponService
 * @Author fengfan
 * @Date 2019/4/23 15:51
 * @Description TODO
 * @Version 1.0
 **/

public interface CouponService {

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 16:10
     * @Paran
     * @Description 获取优惠券
     * @Exception
     **/
    int insertCouponGain(int couponID,int userID,int duration) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 16:12
     * @Paran
     * @Description 查询优惠券
     * @Exception
     **/
    List<CouponEntity> queryCoupon() throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 16:15
     * @Paran
     * @Description 查询用户获得优惠券
     * @Exception
     **/
    CouponVo queryCouponGain(int userID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 16:17
     * @Paran
     * @Description 使用优惠券
     * @Exception
     **/
    int updateIsUse(int id) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 16:19
     * @Paran
     * @Description 根据ID查询优惠券
     * @Exception
     **/
    CouponEntity queryCouponByID(int id) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 16:29
     * @Paran
     * @Description 查询符合优惠的
     * @Exception
     **/
    List<CouponGainVo> queryMeetCoupon(int userID, BigDecimal full) throws Exception;
}
