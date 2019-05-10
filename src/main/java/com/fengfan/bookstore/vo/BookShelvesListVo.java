package com.fengfan.bookstore.vo;


import java.math.BigDecimal;

/**
 * @ClassName BookShelvesVo
 * @Author fengfan
 * @Date 2019/4/15 14:20
 * @Description 查询上架书籍VO
 * @Version 1.0
 **/
public class BookShelvesListVo {
    private int id;  //上架id
    private String url;  //展示图片
    private String describe;  //描述
    private BigDecimal price;  //价格
    private int sales;  //销量

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
