package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.UserEntity;

/**
 * @ClassName UserDao
 * @Author fengfan
 * @Date 2019/4/14 11:37
 * @Description TODO
 * @Version 1.0
 **/

public interface UserDao {
    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/17 15:39
     * @Paran
     * @Description 查询用户
     * @Exception
     **/
    UserEntity selectUser(String openID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/17 15:40
     * @Paran
     * @Description 插入一个用户
     * @Exception
     **/
    int insertUser(UserEntity userEntity) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/17 15:46
     * @Paran
     * @Description 修改用户信息
     * @Exception
     **/
    int updateUser(UserEntity userEntity) throws Exception;
}
