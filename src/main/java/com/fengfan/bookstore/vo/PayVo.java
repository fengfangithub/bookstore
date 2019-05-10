package com.fengfan.bookstore.vo;

import java.math.BigDecimal;

/**
 * @ClassName PayVo
 * @Author fengfan
 * @Date 2019/5/6 15:49
 * @Description TODO
 * @Version 1.0
 **/
public class PayVo {
    private int userID;
    private String password;
    private int addressID;
    private int couponID;
    private int bookShelvesID;
    private int num;
    private String leaveMessage;
    private BigDecimal amount;
    private int points;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getCouponID() {
        return couponID;
    }

    public void setCouponID(int couponID) {
        this.couponID = couponID;
    }

    public int getBookShelvesID() {
        return bookShelvesID;
    }

    public void setBookShelvesID(int bookShelvesID) {
        this.bookShelvesID = bookShelvesID;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "PayVo{" +
                "userID=" + userID +
                ", password='" + password + '\'' +
                ", addressID=" + addressID +
                ", couponID=" + couponID +
                ", bookShelvesID=" + bookShelvesID +
                ", num=" + num +
                ", leaveMessage='" + leaveMessage + '\'' +
                ", amount=" + amount +
                ", points=" + points +
                '}';
    }
}
