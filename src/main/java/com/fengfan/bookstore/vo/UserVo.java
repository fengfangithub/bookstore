package com.fengfan.bookstore.vo;

import java.math.BigDecimal;

/**
 * @ClassName UserVo
 * @Author fengfan
 * @Date 2019/4/18 11:08
 * @Description TODO
 * @Version 1.0
 **/
public class UserVo {
    private int id;
    private int points;
    private BigDecimal balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
