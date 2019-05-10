package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.OrderEntity;
import com.fengfan.bookstore.vo.OrderListVo;
import com.fengfan.bookstore.vo.OrderShowVo;

import java.util.List;

/**
 * @ClassName OrderService
 * @Author fengfan
 * @Date 2019/4/22 17:39
 * @Description TODO
 * @Version 1.0
 **/
public interface OrderService {



    List<OrderListVo> queryNoPayOrderList(int userID) throws Exception;

    List<OrderListVo> queryDeliveryOrderList(int userID) throws Exception;

    List<OrderListVo> queryTakeOrderList(int userID) throws Exception;

    List<OrderListVo> queryCompleteOrderList(int userID) throws Exception;

    List<OrderListVo> queryAfterSalesOrderList(int userID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/7 16:33
     * @Paran
     * @return
     * @Description TODO
     * @Exception 确认订单展示
     **/
    OrderShowVo queryOrderShow(int userID,int bookShelvesID) throws Exception;

    int insertOrder(OrderEntity orderEntity) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/23 11:01
     * @Paran
     * @Description 收货
     * @Exception
     **/
    int updateTakeOrder(int userID, int orderID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/8 15:36
     * @Paran
     * @return
     * @Description 根据ID查询订单信息
     * @Exception
     **/
    OrderEntity queryOrder(int orderID) throws Exception;

    int updateComment(OrderEntity orderEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/7 14:23
     * @Paran
     * @return
     * @Description TODO
     * @Exception 付款
     **/
    int updatePay(int userID,int orderID,String password) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/7 14:25
     * @Paran
     * @return
     * @Description TODO
     * @Exception 退款
     **/
    int updateReturn(int userID,int orderID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/7 14:23
     * @Paran
     * @return
     * @Description TODO
     * @Exception 删除订单
     **/
    int deleteOrder(int userID, int orderID) throws Exception;
}
