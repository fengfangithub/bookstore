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
    private int needPoins;  //需要积分
    private int duration;  //优惠券时间
    private BigDecimal full;  //满多少元能用
    private BigDecimal substract;  //减多少元
    private int isDelete;  //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNeedPoins() {
        return needPoins;
    }

    public void setNeedPoins(int needPoins) {
        this.needPoins = needPoins;
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

    public BigDecimal getSubstract() {
        return substract;
    }

    public void setSubstract(BigDecimal substract) {
        this.substract = substract;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
