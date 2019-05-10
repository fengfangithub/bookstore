package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.CouponEntity;
import com.fengfan.bookstore.entity.CouponsGainEntity;

/**
 * @ClassName OrderCouponVo
 * @Author fengfan
 * @Date 2019/5/2 20:12
 * @Description TODO
 * @Version 1.0
 **/
public class OrderCouponVo {
    private CouponEntity couponEntity;
    private CouponsGainEntity couponsGainEntity;

    public CouponEntity getCouponEntity() {
        return couponEntity;
    }

    public void setCouponEntity(CouponEntity couponEntity) {
        this.couponEntity = couponEntity;
    }

    public CouponsGainEntity getCouponsGainEntity() {
        return couponsGainEntity;
    }

    public void setCouponsGainEntity(CouponsGainEntity couponsGainEntity) {
        this.couponsGainEntity = couponsGainEntity;
    }
}
