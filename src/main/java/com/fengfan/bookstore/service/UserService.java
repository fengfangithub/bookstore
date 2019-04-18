package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.UserEntity;
import com.fengfan.bookstore.vo.UserVo;

import java.math.BigDecimal;

/**
 * @ClassName UserService
 * @Author fengfan
 * @Date 2019/4/17 16:22
 * @Description TODO
 * @Version 1.0
 **/

public interface UserService {

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 10:50
     * @Paran
     * @Description 用户登陆
     * @Exception
     **/
    UserVo queryUser(String code) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 10:51
     * @Paran
     * @Description 用户信息修改
     * @Exception
     **/

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 13:14
     * @Paran
     * @Description 添加一个用户
     * @Exception
     **/
    UserVo insertUser(UserEntity userEntity, String openID) throws Exception;

    int updateBalance(int id, BigDecimal balance) throws Exception;

    int updatePoints(int id, int points) throws Exception;
}
