package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.AdminDao;
import com.fengfan.bookstore.dao.OrderDao;
import com.fengfan.bookstore.dao.UserDao;
import com.fengfan.bookstore.entity.AdminEntity;
import com.fengfan.bookstore.entity.BookEntity;
import com.fengfan.bookstore.entity.BookShelvesEntity;
import com.fengfan.bookstore.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public int queryAdmin(String name, String password) throws Exception {
        AdminEntity adminEntity = new AdminEntity();
        adminEntity.setName(name);
        adminEntity.setPassword(password);
        return adminDao.selectAdmin(adminEntity);
    }

    @Override
    public int insertBookShelves(BookShelvesEntity bookShelvesEntity) throws Exception {
        return 0;
    }

    @Override
    public int insertBook(BookEntity bookEntity) throws Exception {
        return 0;
    }

    @Override
    public int delivery(int orderID) throws Exception {
        return 0;
    }

    @Override
    public int refund(int orderID) throws Exception {
        return 0;
    }
}
