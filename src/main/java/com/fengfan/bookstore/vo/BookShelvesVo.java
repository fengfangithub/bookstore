package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.BookEntity;
import com.fengfan.bookstore.entity.DetailedEntity;
import com.fengfan.bookstore.entity.ShowImgEntity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName BookShelvesVo
 * @Author fengfan
 * @Date 2019/4/18 17:15
 * @Description TODO
 * @Version 1.0
 **/
public class BookShelvesVo {
    private int id;  //上架id
    private BigDecimal originalPrice;  //图书原价
    private BigDecimal price;  //图书现价
    private String isExpressFee;  //是否包邮
    private String isReal;  //是否是正品
    private String isReturn;  //是否七天退换
    private String isRefund;  //是否急速退款
    private BigDecimal postage;  //邮费
    private int sales;  //销量
    private String describe;  //上架书描述
    private int points;  //获得积分
    private BookEntity bookEntity;
    private List<ShowImgEntity> showImgEntityList;
    private List<DetailedEntity> detailedEntityList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getIsExpressFee() {
        return isExpressFee;
    }

    public void setIsExpressFee(String isExpressFee) {
        this.isExpressFee = isExpressFee;
    }

    public String getIsReal() {
        return isReal;
    }

    public void setIsReal(String isReal) {
        this.isReal = isReal;
    }

    public String getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(String isReturn) {
        this.isReturn = isReturn;
    }

    public String getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(String isRefund) {
        this.isRefund = isRefund;
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

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }

    public List<ShowImgEntity> getShowImgEntityList() {
        return showImgEntityList;
    }

    public void setShowImgEntityList(List<ShowImgEntity> showImgEntityList) {
        this.showImgEntityList = showImgEntityList;
    }

    public List<DetailedEntity> getDetailedEntityList() {
        return detailedEntityList;
    }

    public void setDetailedEntityList(List<DetailedEntity> detailedEntityList) {
        this.detailedEntityList = detailedEntityList;
    }
}
