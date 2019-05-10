package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.ShoppingCatEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName ShoppingCatDao
 * @Author fengfan
 * @Date 2019/4/23 14:47
 * @Description TODO
 * @Version 1.0
 **/
public interface ShoppingCatDao {

    int insertShoppingCat(ShoppingCatEntity shoppingCatEntity) throws Exception;

    int deleteShoppingCat(@Param("id") int id) throws Exception;

    List<ShoppingCatEntity> selectShoppingCat(@Param("userID") int userID) throws Exception;

}
