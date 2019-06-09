package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.BookShelvesDao;
import com.fengfan.bookstore.dao.CouponDao;
import com.fengfan.bookstore.dao.OrderDao;
import com.fengfan.bookstore.dao.UserDao;
import com.fengfan.bookstore.entity.BookShelvesEntity;
import com.fengfan.bookstore.entity.OrderEntity;
import com.fengfan.bookstore.entity.UserEntity;
import com.fengfan.bookstore.service.UserService;
import com.fengfan.bookstore.vo.PayVo;
import com.fengfan.bookstore.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


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

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CouponDao couponDao;

    @Autowired
    private BookShelvesDao bookShelvesDao;

    @Override
    public UserVo queryUser(String openID) throws Exception {
        UserEntity userEntity = userDao.selectUser(openID);
        if (userEntity != null) {
            UserVo userVo = new UserVo();
            userVo.setId(userEntity.getId());
            userVo.setBalance(userEntity.getBalance());
            userVo.setPoints(userEntity.getPoints());
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
            return userVo;
        }
        return null;
    }

    // 0 支付密码错误 1 支付成功 exception 余额不足
    @Override
    public int pay(List<PayVo> payVoList) throws Exception {
        int result = 0;
        for (PayVo payVo : payVoList) {
            int r1 = userDao.selectUserPassword(payVo.getUserID(), payVo.getPassword());
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setNumber(payVo.getNum());
            orderEntity.setPrice(payVo.getAmount());
            orderEntity.setLeaveMessage(payVo.getLeaveMessage());
            orderEntity.setAddressID(payVo.getAddressID());
            orderEntity.setBookShelvesID(payVo.getBookShelvesID());
            orderEntity.setUserID(payVo.getUserID());
            orderEntity.setState(1);
            StringBuffer sb = new StringBuffer();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String time = simpleDateFormat.format(new Date());
            sb.append(time);
            Random random = new Random(System.currentTimeMillis());
            for (int i = 0; i < 3; i++) {
                sb.append(random.nextInt(9));
            }
            orderEntity.setOrderNumber(sb.toString());
            if (r1 == 1) {
                result += 1;
                UserEntity userEntity = new UserEntity();
                userEntity.setId(payVo.getUserID());
                userEntity.setBalance(payVo.getAmount().negate());
                userEntity.setPoints(payVo.getPoints());
                int r2 = userDao.updateUser(userEntity);
                if (r2 == 1) {
                    orderEntity.setState(2);
                    orderDao.insertOrder(orderEntity);
                    if (payVo.getCouponID() != 0) {
                        couponDao.updateIsUse(payVo.getCouponID());
                    }
                    BookShelvesEntity bookShelvesEntity = new BookShelvesEntity();
                    bookShelvesEntity.setId(payVo.getBookShelvesID());
                    bookShelvesEntity.setSales(payVo.getNum());
                    bookShelvesDao.updateSales(bookShelvesEntity);
                }
            } else {
                orderDao.insertOrder(orderEntity);
            }
        }
        return result;
    }

    @Override
    public int payWX(List<PayVo> payVoList) throws Exception {
        int result = 0;
        for (PayVo payVo : payVoList) {
            int r1 = userDao.selectUserPassword(payVo.getUserID(), payVo.getPassword());
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setNumber(payVo.getNum());
            orderEntity.setPrice(payVo.getAmount());
            orderEntity.setLeaveMessage(payVo.getLeaveMessage());
            orderEntity.setAddressID(payVo.getAddressID());
            orderEntity.setBookShelvesID(payVo.getBookShelvesID());
            orderEntity.setUserID(payVo.getUserID());
            orderEntity.setState(1);
            StringBuffer sb = new StringBuffer();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String time = simpleDateFormat.format(new Date());
            sb.append(time);
            Random random = new Random(System.currentTimeMillis());
            for (int i = 0; i < 3; i++) {
                sb.append(random.nextInt(9));
            }
            orderEntity.setOrderNumber(sb.toString());
            if (r1 == 1) {
                result += 1;
                UserEntity userEntity = new UserEntity();
                userEntity.setId(payVo.getUserID());
                userEntity.setPoints(payVo.getPoints());
                int r2 = userDao.updateUser(userEntity);
                if (r2 == 1) {
                    orderEntity.setState(2);
                    orderDao.insertOrder(orderEntity);
                    if (payVo.getCouponID() != 0) {
                        couponDao.updateIsUse(payVo.getCouponID());
                    }
                }
            } else {
                orderDao.insertOrder(orderEntity);
            }
        }
        return result;
    }

    @Override
    public int recharge(int userID, BigDecimal money) throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userID);
        userEntity.setBalance(money);
        return userDao.updateUser(userEntity);
    }

    @Override
    public int convert(int userID, int couponID) throws Exception {
        return 0;
    }
}
