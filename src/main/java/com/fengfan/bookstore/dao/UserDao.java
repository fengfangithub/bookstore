package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

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

    UserEntity selectByID(int id) throws Exception;

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

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/22 16:57
     * @Paran
     * @Description 查询支付密码
     * @Exception
     **/
    int selectUserPassword(@Param("userID") int userID, @Param("password") String password) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/23 10:02
     * @Paran
     * @return
     * @Description 查询微信支付密码
     * @Exception
     **/
    int selectUserWXPassword(@Param("userID") int userID, @Param("wxPassword") String wxPassword) throws Exception;
}
