package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.BookShelvesEntity;
import com.fengfan.bookstore.entity.ShoppingCatEntity;
import com.fengfan.bookstore.entity.ShowImgEntity;

/**
 * @ClassName ShoppingCatVo
 * @Author fengfan
 * @Date 2019/4/23 15:08
 * @Description TODO
 * @Version 1.0
 **/
public class ShoppingCatVo {

    private ShoppingCatEntity shoppingCatEntity;
    private BookShelvesEntity bookShelvesEntity;
    private ShowImgEntity showImgEntity;

    public ShoppingCatEntity getShoppingCatEntity() {
        return shoppingCatEntity;
    }

    public void setShoppingCatEntity(ShoppingCatEntity shoppingCatEntity) {
        this.shoppingCatEntity = shoppingCatEntity;
    }

    public BookShelvesEntity getBookShelvesEntity() {
        return bookShelvesEntity;
    }

    public void setBookShelvesEntity(BookShelvesEntity bookShelvesEntity) {
        this.bookShelvesEntity = bookShelvesEntity;
    }

    public ShowImgEntity getShowImgEntity() {
        return showImgEntity;
    }

    public void setShowImgEntity(ShowImgEntity showImgEntity) {
        this.showImgEntity = showImgEntity;
    }
}
