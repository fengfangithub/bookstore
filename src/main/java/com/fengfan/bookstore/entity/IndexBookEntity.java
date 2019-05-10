package com.fengfan.bookstore.entity;

import java.math.BigDecimal;

/**
 * @ClassName IndexBookEntity
 * @Author fengfan
 * @Date 2019/5/1 17:15
 * @Description TODO
 * @Version 1.0
 **/
public class IndexBookEntity {
    private int bookID;  //上架id
    private BigDecimal price;  //图书现价
    private int sales;  //销量
    private String describe;  //上架书描述
    private int categoryID;  //分类id
    private String name;  //分类名
    private String url;  //展示图片

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
