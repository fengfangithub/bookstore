package com.fengfan.bookstore.entity;

/**
 * @ClassName CouponsGainEntity
 * @Author fengfan
 * @Date 2019/4/6 14:38
 * @Description 用户获得的优惠券实体类
 * @Version 1.0
 **/
public class CouponsGainEntity {
    private int id;  //优惠ID
    private int couponID;  //优惠券ID
    private int userID;  //用户ID
    private String startTime;  //开始时间
    private String endTime;  //结束时间
    private int isUse;  //是否使用
    private int isDelete;  //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCouponID() {
        return couponID;
    }

    public void setCouponID(int couponID) {
        this.couponID = couponID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getIsUse() {
        return isUse;
    }

    public void setIsUse(int isUse) {
        this.isUse = isUse;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
