package com.fengfan.bookstore.entity;

import java.math.BigDecimal;

/**
 * @ClassName BookShelvesEntity
 * @Author fengfan
 * @Date 2019/4/6 12:50
 * @Description 上架图书实体
 * @Version 1.0
 **/
public class BookShelvesEntity {
    private int id;  //上架id
    private int bookID;  //图书id
    private BigDecimal originalPrice;  //图书原价
    private BigDecimal price;  //图书现价
    private int isExpressFee;  //是否包邮
    private int isReal;  //是否是正品
    private int isReturn;  //是否七天退换
    private int isRefund;  //是否急速退款
    private int isDelete;  //是否删除
    private BigDecimal postage;  //邮费
    private int sales;  //销量
    private int categoryID;  //分类ID
    private String describe;  //上架书描述
    private int points;  //获得积分

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getIsExpressFee() {
        return isExpressFee;
    }

    public void setIsExpressFee(int isExpressFee) {
        this.isExpressFee = isExpressFee;
    }

    public int getIsReal() {
        return isReal;
    }

    public void setIsReal(int isReal) {
        this.isReal = isReal;
    }

    public int getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(int isReturn) {
        this.isReturn = isReturn;
    }

    public int getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(int isRefund) {
        this.isRefund = isRefund;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "BookShelvesEntity{" +
                "id=" + id +
                ", bookID=" + bookID +
                ", originalPrice=" + originalPrice +
                ", price=" + price +
                ", isExpressFee=" + isExpressFee +
                ", isReal=" + isReal +
                ", isReturn=" + isReturn +
                ", isRefund=" + isRefund +
                ", isDelete=" + isDelete +
                ", postage=" + postage +
                ", sales=" + sales +
                ", categoryID=" + categoryID +
                ", describe='" + describe + '\'' +
                ", points=" + points +
                '}';
    }
}
