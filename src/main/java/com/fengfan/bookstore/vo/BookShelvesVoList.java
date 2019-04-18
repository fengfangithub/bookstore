package com.fengfan.bookstore.vo;


import java.math.BigDecimal;

/**
 * @ClassName BookShelvesVo
 * @Author fengfan
 * @Date 2019/4/15 14:20
 * @Description 查询上架书籍VO
 * @Version 1.0
 **/
public class BookShelvesVoList {
    private int id;  //上架id
    private String showImg;  //展示图片
    private String describe;  //描述
    private BigDecimal price;  //价格
    private int sales;  //销量

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShowImg() {
        return showImg;
    }

    public void setShowImg(String showImg) {
        this.showImg = showImg;
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
