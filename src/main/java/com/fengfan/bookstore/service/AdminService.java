package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.BookEntity;
import com.fengfan.bookstore.entity.BookShelvesEntity;

/**
 * @ClassName AdminService
 * @Author fengfan
 * @Date 2019/5/9 12:04
 * @Description TODO
 * @Version 1.0
 **/

public interface AdminService {
    int queryAdmin(String name, String password) throws Exception;

    int insertBookShelves(BookShelvesEntity bookShelvesEntity) throws Exception;

    int insertBook(BookEntity bookEntity) throws Exception;

    int delivery(int orderID) throws Exception;

    int refund(int orderID) throws Exception;
}
