package com.fengfan.bookstore.entity;

import java.math.BigDecimal;

/**
 * @ClassName OrderEntity
 * @Author fengfan
 * @Date 2019/4/6 14:54
 * @Description 订单实体类
 * @Version 1.0
 **/
public class OrderEntity {
    private int id;  //订单ID
    private int number;  //购买数量
    private BigDecimal price;  //金额
    private String orderNumber;  //订单号
    private String createDate;  //创建时间
    private int state;  //订单状态
    private int isDelete; //是否删除
    private int bookShelvesID;  //上架图书ID
    private int addressID;  //地址信息ID
    private int userID;  //用户ID
    private String leaveMessage;
    private int isComment;  //是否评论

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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getBookShelvesID() {
        return bookShelvesID;
    }

    public void setBookShelvesID(int bookShelvesID) {
        this.bookShelvesID = bookShelvesID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getLeaveMessage() {
        return leaveMessage;
    }

    public void setLeaveMessage(String leaveMessage) {
        this.leaveMessage = leaveMessage;
    }

    public int getIsComment() {
        return isComment;
    }

    public void setIsComment(int isComment) {
        this.isComment = isComment;
    }
}
