package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.AdminEntity;

/**
 * @ClassName AdminDao
 * @Author fengfan
 * @Date 2019/5/9 11:56
 * @Description TODO
 * @Version 1.0
 **/
public interface AdminDao {
    int selectAdmin(AdminEntity adminEntity) throws Exception;
}
