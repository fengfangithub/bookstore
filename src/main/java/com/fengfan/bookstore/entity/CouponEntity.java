package com.fengfan.bookstore.entity;

import java.math.BigDecimal;

/**
 * @ClassName CouponEntity
 * @Author fengfan
 * @Date 2019/4/6 14:30
 * @Description 优惠券实体类
 * @Version 1.0
 **/
public class CouponEntity {
    private int id;  //优惠券ID
    private int needPoints;  //需要积分
    private int duration;  //优惠券时间
    private BigDecimal full;  //满多少元能用
    private BigDecimal subtract;  //减多少元
    private int isDelete;  //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNeedPoints() {
        return needPoints;
    }

    public void setNeedPoints(int needPoints) {
        this.needPoints = needPoints;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public BigDecimal getFull() {
        return full;
    }

    public void setFull(BigDecimal full) {
        this.full = full;
    }

    public BigDecimal getSubtract() {
        return subtract;
    }

    public void setSubtract(BigDecimal subtract) {
        this.subtract = subtract;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
