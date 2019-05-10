package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.ShoppingCatEntity;
import com.fengfan.bookstore.vo.ShoppingCatVo;

import java.util.List;

/**
 * @ClassName ShoppingCatService
 * @Author fengfan
 * @Date 2019/4/23 15:06
 * @Description TODO
 * @Version 1.0
 **/
public interface ShoppingCatService {

    int insertShoppingCat(ShoppingCatEntity shoppingCatEntity) throws Exception;

    List<ShoppingCatVo> queryShoppingCat(int userID) throws Exception;

    int deleteShoppingCat(int id) throws Exception;
}
