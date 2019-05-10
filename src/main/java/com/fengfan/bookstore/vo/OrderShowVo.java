package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.*;

import java.util.List;

/**
 * @ClassName OrderVo
 * @Author fengfan
 * @Date 2019/4/22 17:41
 * @Description TODO
 * @Version 1.0
 **/
public class OrderShowVo {
    private AddressEntity addressEntity;
    private BookShelvesEntity bookShelvesEntity;
    private ShowImgEntity showImgEntity;
    private List<OrderCouponVo> orderCouponVoList;

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
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

    public List<OrderCouponVo> getOrderCouponVoList() {
        return orderCouponVoList;
    }

    public void setOrderCouponVoList(List<OrderCouponVo> orderCouponVoList) {
        this.orderCouponVoList = orderCouponVoList;
    }
}
