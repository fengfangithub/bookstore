package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.CommentEntity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName OrderVo
 * @Author fengfan
 * @Date 2019/4/22 17:39
 * @Description TODO
 * @Version 1.0
 **/
public class OrderListVo {
    private int id;  //订单ID
    private int number;  //购买数量
    private BigDecimal price;  //订单金额
    private String orderNumber;  //订单号
    private String url;  //订单图片
    private String describe;  //书籍描述
    private BigDecimal bookPrice;  //
    private String time;
    private int isComment;  //是否评论

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getIsComment() {
        return isComment;
    }

    public void setIsComment(int isComment) {
        this.isComment = isComment;
    }
}
