package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.OrderEntity;

import java.util.List;

/**
 * @ClassName OrderDao
 * @Author fengfan
 * @Date 2019/4/17 10:47
 * @Description TODO
 * @Version 1.0
 **/

public interface OrderDao {

    /**
     * @Author fengfan
     * @Date 2019/4/17 10:48
     * @Paran
     * @return
     * @Description 查询订单
     * @Exception
     **/
    List<OrderEntity> selectOrder() throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/17 10:50
     * @Paran
     * @return
     * @Description 插入一个订单
     * @Exception
     **/
    int insertOrder(OrderEntity orderEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/17 10:50
     * @Paran
     * @return
     * @Description 修改订单信息
     * @Exception
     **/
    int updateOrder(OrderEntity orderEntity) throws Exception;
}
