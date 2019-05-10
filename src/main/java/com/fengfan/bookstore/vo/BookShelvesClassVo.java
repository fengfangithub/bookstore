package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.IndexBookEntity;

import java.util.List;

/**
 * @ClassName BookShelvesClass
 * @Author fengfan
 * @Date 2019/5/9 18:15
 * @Description TODO
 * @Version 1.0
 **/
public class BookShelvesClassVo {
   private List<IndexBookEntity> bookDefault;
   private List<IndexBookEntity> bookTime;
   private List<IndexBookEntity> bookPrice;
   private List<IndexBookEntity> bookSales;

    public List<IndexBookEntity> getBookDefault() {
        return bookDefault;
    }

    public void setBookDefault(List<IndexBookEntity> bookDefault) {
        this.bookDefault = bookDefault;
    }

    public List<IndexBookEntity> getBookTime() {
        return bookTime;
    }

    public void setBookTime(List<IndexBookEntity> bookTime) {
        this.bookTime = bookTime;
    }

    public List<IndexBookEntity> getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(List<IndexBookEntity> bookPrice) {
        this.bookPrice = bookPrice;
    }

    public List<IndexBookEntity> getBookSales() {
        return bookSales;
    }

    public void setBookSales(List<IndexBookEntity> bookSales) {
        this.bookSales = bookSales;
    }
}
