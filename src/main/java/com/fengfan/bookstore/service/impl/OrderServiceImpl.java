package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.*;
import com.fengfan.bookstore.entity.*;
import com.fengfan.bookstore.service.OrderService;
import com.fengfan.bookstore.vo.OrderCouponVo;
import com.fengfan.bookstore.vo.OrderListVo;
import com.fengfan.bookstore.vo.OrderShowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Author fengfan
 * @Date 2019/4/22 17:43
 * @Description TODO
 * @Version 1.0
 **/

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private BookShelvesDao bookShelvesDao;

    @Autowired
    private AddressDao addressDao;

    @Autowired
    private CouponDao couponDao;

    @Autowired
    private UserDao userDao;

    @Override
    public List<OrderListVo> queryNoPayOrderList(int userID) throws Exception {
        List<OrderEntity> orderEntityList = orderDao.selectNoPayOrderList(userID);
        List<OrderListVo> orderListVos = new ArrayList<>();
        for (OrderEntity orderEntity : orderEntityList) {
            BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(orderEntity.getBookShelvesID());
            OrderListVo orderListVo = new OrderListVo();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(orderEntity.getCreateDate());
            String time = simpleDateFormat.format(date);
            orderListVo.setTime(time);
            orderListVo.setId(orderEntity.getId());
            orderListVo.setDescribe(bookShelvesEntity.getDescribe());
            orderListVo.setNumber(orderEntity.getNumber());
            orderListVo.setOrderNumber(orderEntity.getOrderNumber());
            orderListVo.setPrice(orderEntity.getPrice());
            orderListVo.setBookPrice(bookShelvesEntity.getPrice());
            orderListVo.setUrl(bookShelvesDao.selectShowImg(orderEntity.getBookShelvesID()).get(0).getUrl());
            orderListVo.setIsComment(orderEntity.getIsComment());
            orderListVos.add(orderListVo);
        }
        return orderListVos;
    }

    @Override
    public List<OrderListVo> queryDeliveryOrderList(int userID) throws Exception {
        List<OrderEntity> orderEntityList = orderDao.selectDeliveryOrderList(userID);
        List<OrderListVo> orderListVos = new ArrayList<>();
        for (OrderEntity orderEntity : orderEntityList) {
            BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(orderEntity.getBookShelvesID());
            OrderListVo orderListVo = new OrderListVo();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(orderEntity.getCreateDate());
            String time = simpleDateFormat.format(date);
            orderListVo.setTime(time);
            orderListVo.setId(orderEntity.getId());
            orderListVo.setDescribe(bookShelvesEntity.getDescribe());
            orderListVo.setNumber(orderEntity.getNumber());
            orderListVo.setOrderNumber(orderEntity.getOrderNumber());
            orderListVo.setPrice(orderEntity.getPrice());
            orderListVo.setBookPrice(bookShelvesEntity.getPrice());
            orderListVo.setUrl(bookShelvesDao.selectShowImg(orderEntity.getBookShelvesID()).get(0).getUrl());
            orderListVo.setIsComment(orderEntity.getIsComment());
            orderListVos.add(orderListVo);
        }
        return orderListVos;
    }

    @Override
    public List<OrderListVo> queryTakeOrderList(int userID) throws Exception {
        List<OrderEntity> orderEntityList = orderDao.selectTakeOrderList(userID);
        List<OrderListVo> orderListVos = new ArrayList<>();
        for (OrderEntity orderEntity : orderEntityList) {
            BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(orderEntity.getBookShelvesID());
            OrderListVo orderListVo = new OrderListVo();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(orderEntity.getCreateDate());
            String time = simpleDateFormat.format(date);
            orderListVo.setTime(time);
            orderListVo.setId(orderEntity.getId());
            orderListVo.setDescribe(bookShelvesEntity.getDescribe());
            orderListVo.setNumber(orderEntity.getNumber());
            orderListVo.setOrderNumber(orderEntity.getOrderNumber());
            orderListVo.setPrice(orderEntity.getPrice());
            orderListVo.setBookPrice(bookShelvesEntity.getPrice());
            orderListVo.setUrl(bookShelvesDao.selectShowImg(orderEntity.getBookShelvesID()).get(0).getUrl());
            orderListVo.setIsComment(orderEntity.getIsComment());
            orderListVos.add(orderListVo);
        }
        return orderListVos;
    }

    @Override
    public List<OrderListVo> queryCompleteOrderList(int userID) throws Exception {
        List<OrderEntity> orderEntityList = orderDao.selectCompleteOrderList(userID);
        List<OrderListVo> orderListVos = new ArrayList<>();
        for (OrderEntity orderEntity : orderEntityList) {
            BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(orderEntity.getBookShelvesID());
            OrderListVo orderListVo = new OrderListVo();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(orderEntity.getCreateDate());
            String time = simpleDateFormat.format(date);
            orderListVo.setTime(time);
            orderListVo.setId(orderEntity.getId());
            orderListVo.setDescribe(bookShelvesEntity.getDescribe());
            orderListVo.setNumber(orderEntity.getNumber());
            orderListVo.setOrderNumber(orderEntity.getOrderNumber());
            orderListVo.setPrice(orderEntity.getPrice());
            orderListVo.setBookPrice(bookShelvesEntity.getPrice());
            orderListVo.setUrl(bookShelvesDao.selectShowImg(orderEntity.getBookShelvesID()).get(0).getUrl());
            orderListVo.setIsComment(orderEntity.getIsComment());
            orderListVos.add(orderListVo);
        }
        return orderListVos;
    }

    @Override
    public List<OrderListVo> queryAfterSalesOrderList(int userID) throws Exception {
        List<OrderEntity> orderEntityList = orderDao.selectAfterSalesOrderList(userID);
        List<OrderListVo> orderListVos = new ArrayList<>();
        for (OrderEntity orderEntity : orderEntityList) {
            BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(orderEntity.getBookShelvesID());
            OrderListVo orderListVo = new OrderListVo();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(orderEntity.getCreateDate());
            String time = simpleDateFormat.format(date);
            orderListVo.setTime(time);
            orderListVo.setId(orderEntity.getId());
            orderListVo.setDescribe(bookShelvesEntity.getDescribe());
            orderListVo.setNumber(orderEntity.getNumber());
            orderListVo.setOrderNumber(orderEntity.getOrderNumber());
            orderListVo.setPrice(orderEntity.getPrice());
            orderListVo.setBookPrice(bookShelvesEntity.getPrice());
            orderListVo.setUrl(bookShelvesDao.selectShowImg(orderEntity.getBookShelvesID()).get(0).getUrl());
            orderListVo.setIsComment(orderEntity.getIsComment());
            orderListVos.add(orderListVo);
        }
        return orderListVos;
    }

    @Override
    public OrderShowVo queryOrderShow(int userID, int bookShelvesID) throws Exception {
        OrderShowVo orderShowVo = new OrderShowVo();
        AddressEntity addressEntity = addressDao.selectDefaultAddress(userID);
        BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(bookShelvesID);
        ShowImgEntity showImgEntity = bookShelvesDao.selectShowImg(bookShelvesID).get(0);
        List<CouponsGainEntity> couponsGainEntityList = couponDao.selectMeetCoupon(userID);
        List<OrderCouponVo> orderCouponVoList = new ArrayList<>();
        for (CouponsGainEntity couponsGainEntity : couponsGainEntityList) {
            CouponEntity couponEntity = couponDao.selectCouponByID(couponsGainEntity.getCouponID());
            OrderCouponVo orderCouponVo = new OrderCouponVo();
            orderCouponVo.setCouponEntity(couponEntity);
            orderCouponVo.setCouponsGainEntity(couponsGainEntity);
            orderCouponVoList.add(orderCouponVo);
        }
        orderShowVo.setOrderCouponVoList(orderCouponVoList);
        orderShowVo.setAddressEntity(addressEntity);
        orderShowVo.setBookShelvesEntity(bookShelvesEntity);
        orderShowVo.setShowImgEntity(showImgEntity);
        return orderShowVo;
    }

    @Override
    public int insertOrder(OrderEntity orderEntity) throws Exception {
        return orderDao.insertOrder(orderEntity);
    }

    @Override
    public OrderEntity queryOrder(int orderID) throws Exception {
        return orderDao.selectOrder(orderID);
    }

    @Override
    public int updateComment(OrderEntity orderEntity) throws Exception {
        return orderDao.updateOrder(orderEntity);
    }

    @Override
    public int updateTakeOrder(int userID, int orderID) throws Exception {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(orderID);
        orderEntity.setUserID(userID);
        orderEntity.setState(4);
        return orderDao.updateOrder(orderEntity);
    }

    @Override
    public int updatePay(int userID, int orderID,String password) throws Exception {
        int r1 = userDao.selectUserPassword(userID, password);
        OrderEntity orderEntity = orderDao.selectOrder(orderID);
        BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(orderEntity.getBookShelvesID());

        OrderEntity  orderEntityUpdate = new OrderEntity();
        orderEntityUpdate.setUserID(userID);
        orderEntityUpdate.setState(2);
        orderEntityUpdate.setId(orderID);

        UserEntity userEntity = new UserEntity();
        userEntity.setId(userID);
        userEntity.setPoints(bookShelvesEntity.getPoints());
        userEntity.setBalance(orderEntity.getPrice().negate());

        if(r1==1){
            int r2 = userDao.updateUser(userEntity);
            if(r2==1){
                BookShelvesEntity bookShelvesEntity1 = new BookShelvesEntity();
                bookShelvesEntity1.setId(bookShelvesEntity.getId());
                bookShelvesEntity1.setSales(orderEntity.getNumber());
                bookShelvesDao.updateSales(bookShelvesEntity1);
                orderDao.updateOrder(orderEntityUpdate);
                return 1;
            }else{
                return 2;
            }
        }else{
            return 0;
        }
    }

    @Override
    public int updateReturn(int userID, int orderID) throws Exception {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(orderID);
        orderEntity.setUserID(userID);
        orderEntity.setState(5);
        return orderDao.updateOrder(orderEntity);
    }

    @Override
    public int deleteOrder(int userID, int orderID) throws Exception {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(orderID);
        orderEntity.setUserID(userID);
        orderEntity.setIsDelete(1);
        return orderDao.updateOrder(orderEntity);
    }
}
