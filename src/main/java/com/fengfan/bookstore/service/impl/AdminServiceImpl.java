package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.*;
import com.fengfan.bookstore.entity.*;
import com.fengfan.bookstore.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AdminServiceImpl
 * @Author fengfan
 * @Date 2019/5/9 18:58
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private BookShelvesDao bookShelvesDao;

    @Autowired
    private BookDao bookDao;

    @Override
    public int queryAdmin(String name, String password) throws Exception {
        AdminEntity adminEntity = new AdminEntity();
        adminEntity.setName(name);
        adminEntity.setPassword(password);
        return adminDao.selectAdmin(adminEntity);
    }

    @Override
    public int insertBookShelves(BookShelvesEntity bookShelvesEntity) throws Exception {
        bookShelvesDao.insertBookShelves(bookShelvesEntity);
        return bookShelvesEntity.getId();
    }

    @Override
    public int insertBook(BookEntity bookEntity) throws Exception {
        return bookDao.insertBook(bookEntity);
    }

    @Override
    public int delivery(int orderID) throws Exception {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(orderID);
        orderEntity.setState(3);
        OrderEntity orderEntity1 = orderDao.selectOrder(orderID);
        orderEntity.setUserID(orderEntity1.getUserID());
        return orderDao.updateOrder(orderEntity);
    }

    @Override
    public int refund(int orderID) throws Exception {
        int result = 0;
        OrderEntity orderEntity = orderDao.selectOrder(orderID);
        OrderEntity orderEntity1 = new OrderEntity();
        orderEntity1.setId(orderID);
        orderEntity1.setState(6);
        orderEntity1.setUserID(orderEntity.getUserID());
        result+=orderDao.updateOrder(orderEntity1);
        UserEntity userEntity = new UserEntity();
        userEntity.setId(orderEntity.getUserID());
        userEntity.setBalance(orderEntity.getPrice());
        result+=userDao.updateUser(userEntity);
        BookShelvesEntity bookShelvesEntity = new BookShelvesEntity();
        bookShelvesEntity.setId(orderEntity.getBookShelvesID());
        bookShelvesEntity.setSales(-1);
        result+= bookShelvesDao.updateSales(bookShelvesEntity);
        return result;
    }

    @Override
    public int insertShowImage(ShowImgEntity showImgEntity) throws Exception {

        return bookShelvesDao.insertShowImage(showImgEntity);
    }

    @Override
    public int insertDetailed(DetailedEntity detailedEntity) throws Exception {
        return bookShelvesDao.insertDetailed(detailedEntity);
    }

    @Override
    public int updateShelves(BookShelvesEntity bookShelvesEntity) throws Exception {
        return bookShelvesDao.updateBookShelves(bookShelvesEntity);
    }

    @Override
    public List<OrderEntity> queryOrder() throws Exception {
        return adminDao.selectOrder();
    }

    @Override
    public List<OrderEntity> queryRefund() throws Exception {
        return adminDao.selectRefund();
    }
}
