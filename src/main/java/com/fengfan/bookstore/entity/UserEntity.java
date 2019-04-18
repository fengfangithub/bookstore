package com.fengfan.bookstore.entity;

import java.math.BigDecimal;

/**
 * @ClassName UserEntity
 * @Author fengfan
 * @Date 2019/4/6 13:14
 * @Description 用户信息实体类
 * @Version 1.0
 **/
public class UserEntity {
    private int id;  //用户id
    private String name;  //用户名
    private int sex;  //用户性别
    private String payPassword;  //用户支付密码
    private int points;  //拥有积分
    private BigDecimal balance;  //拥有余额
    private String openID;  //用户唯一标识

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
