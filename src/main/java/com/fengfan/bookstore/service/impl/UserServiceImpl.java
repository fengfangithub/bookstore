package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.UserDao;
import com.fengfan.bookstore.entity.UserEntity;
import com.fengfan.bookstore.service.UserService;
import com.fengfan.bookstore.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * @ClassName UserServiceImpl
 * @Author fengfan
 * @Date 2019/4/18 10:41
 * @Description TODO
 * @Version 1.0
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserVo queryUser(String openID) throws Exception {
        UserEntity userEntity = userDao.selectUser(openID);
        if (userEntity != null) {
            UserVo userVo = new UserVo();
            userVo.setBalance(userEntity.getBalance());
            userVo.setPoints(userEntity.getPoints());
            userVo.setOpenID(userEntity.getOpenID());
            return userVo;
        }
        return new UserVo();
    }

    @Override
    public UserVo insertUser(UserEntity userEntity, String openID) throws Exception {
        int result = userDao.insertUser(userEntity);
        if (result == 1) {
            UserEntity user = userDao.selectUser(openID);
            UserVo userVo = new UserVo();
            userVo.setBalance(user.getBalance());
            userVo.setPoints(user.getPoints());
            userVo.setOpenID(user.getOpenID());
            return userVo;
        }
        return null;
    }

    @Override
    public int updateBalance(int id, BigDecimal balance) throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setBalance(balance);
        return userDao.updateUser(userEntity);
    }

    @Override
    public int updatePoints(int id, int points) throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setPoints(points);
        return userDao.updateUser(userEntity);
    }
}
