package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.OrderEntity;
import org.apache.ibatis.annotations.Param;

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
     * @Description 查询未付款订单列表
     * @Exception
     **/
    List<OrderEntity> selectNoPayOrderList(@Param("userID") int userID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/17 10:48
     * @Paran
     * @return
     * @Description 查询待发货订单列表
     * @Exception
     **/
    List<OrderEntity> selectDeliveryOrderList(@Param("userID") int userID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/17 10:48
     * @Paran
     * @return
     * @Description 查询待收货订单列表
     * @Exception
     **/
    List<OrderEntity> selectTakeOrderList(@Param("userID") int userID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/17 10:48
     * @Paran
     * @return
     * @Description 查询已完成订单列表
     * @Exception
     **/
    List<OrderEntity> selectCompleteOrderList(@Param("userID") int userID) throws Exception;

    List<OrderEntity> selectAfterSalesOrderList(@Param("userID") int userID) throws Exception;


    /**
     * @Author fengfan
     * @Date 2019/4/22 16:48
     * @Paran
     * @return
     * @Description 根据ID查询订单
     * @Exception
     **/
    OrderEntity selectOrder(@Param("orderID") int orderID) throws Exception;

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
     * @Date 2019/4/22 16:51
     * @Paran
     * @return
     * @Description 修改订单状态
     * @Exception
     **/
    int updateOrder(OrderEntity orderEntity) throws Exception;
}
