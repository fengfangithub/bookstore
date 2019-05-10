package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.CouponEntity;
import com.fengfan.bookstore.entity.CouponsGainEntity;

/**
 * @ClassName CouponGainVo
 * @Author fengfan
 * @Date 2019/4/23 16:16
 * @Description TODO
 * @Version 1.0
 **/
public class CouponGainVo {
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
