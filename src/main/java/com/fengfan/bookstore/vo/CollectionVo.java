package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.BookShelvesEntity;

/**
 * @ClassName CollectionVo
 * @Author fengfan
 * @Date 2019/4/23 14:20
 * @Description TODO
 * @Version 1.0
 **/
public class CollectionVo {
    private int id;  //收藏ID
    private BookShelvesEntity bookShelvesEntity;  //上架商品
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookShelvesEntity getBookShelvesEntity() {
        return bookShelvesEntity;
    }

    public void setBookShelvesEntity(BookShelvesEntity bookShelvesEntity) {
        this.bookShelvesEntity = bookShelvesEntity;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
