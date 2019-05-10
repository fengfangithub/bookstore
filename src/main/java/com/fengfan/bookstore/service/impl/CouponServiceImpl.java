package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.CouponDao;
import com.fengfan.bookstore.entity.CouponEntity;
import com.fengfan.bookstore.entity.CouponsGainEntity;
import com.fengfan.bookstore.service.CouponService;
import com.fengfan.bookstore.vo.CouponGainVo;
import com.fengfan.bookstore.vo.CouponVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @ClassName CouponServiceImpl
 * @Author fengfan
 * @Date 2019/4/23 16:30
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponDao couponDao;

    @Override
    public int insertCouponGain(int couponID,int userID,int duration) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:dd");
        Date date = new Date();
        String starTime= simpleDateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,duration);
        date = calendar.getTime();
        String endTime = simpleDateFormat.format(date);
        CouponsGainEntity couponsGainEntity = new CouponsGainEntity();
        couponsGainEntity.setCouponID(couponID);
        couponsGainEntity.setUserID(userID);
        couponsGainEntity.setStartTime(starTime);
        couponsGainEntity.setEndTime(endTime);
        return couponDao.insertCouPonGain(couponsGainEntity);
    }

    @Override
    public List<CouponEntity> queryCoupon() throws Exception {
        return couponDao.selectCoupon();
    }

    @Override
    public CouponVo queryCouponGain(int userID) throws Exception {
        List<CouponsGainEntity> dotUseGain = couponDao.selectDotUse(userID);
        List<CouponsGainEntity> useGain = couponDao.selectUse(userID);
        List<CouponsGainEntity> overdueGain = couponDao.selectOverdue(userID);
        List<CouponGainVo> dotUse = new ArrayList<>();
        List<CouponGainVo> use = new ArrayList<>();
        List<CouponGainVo> overdue = new ArrayList<>();
        for (CouponsGainEntity couponsGainEntity : dotUseGain) {
            CouponGainVo couponGainVo = new CouponGainVo();
            CouponEntity couponEntity = couponDao.selectCouponByID(couponsGainEntity.getCouponID());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = simpleDateFormat.parse(couponsGainEntity.getStartTime());
            Date endDate = simpleDateFormat.parse(couponsGainEntity.getEndTime());
            String startTime = simpleDateFormat.format(startDate);
            String endTime = simpleDateFormat.format(endDate);
            couponsGainEntity.setStartTime(startTime);
            couponsGainEntity.setEndTime(endTime);
            couponGainVo.setCouponEntity(couponEntity);
            couponGainVo.setCouponsGainEntity(couponsGainEntity);
            dotUse.add(couponGainVo);
        }
        for (CouponsGainEntity couponsGainEntity : useGain) {
            CouponGainVo couponGainVo = new CouponGainVo();
            CouponEntity couponEntity = couponDao.selectCouponByID(couponsGainEntity.getCouponID());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = simpleDateFormat.parse(couponsGainEntity.getStartTime());
            Date endDate = simpleDateFormat.parse(couponsGainEntity.getEndTime());
            String startTime = simpleDateFormat.format(startDate);
            String endTime = simpleDateFormat.format(endDate);
            couponsGainEntity.setStartTime(startTime);
            couponsGainEntity.setEndTime(endTime);
            couponGainVo.setCouponEntity(couponEntity);
            couponGainVo.setCouponsGainEntity(couponsGainEntity);
            couponGainVo.setCouponEntity(couponEntity);
            couponGainVo.setCouponsGainEntity(couponsGainEntity);
            use.add(couponGainVo);
        }
        for (CouponsGainEntity couponsGainEntity : overdueGain) {
            CouponGainVo couponGainVo = new CouponGainVo();
            CouponEntity couponEntity = couponDao.selectCouponByID(couponsGainEntity.getCouponID());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = simpleDateFormat.parse(couponsGainEntity.getStartTime());
            Date endDate = simpleDateFormat.parse(couponsGainEntity.getEndTime());
            String startTime = simpleDateFormat.format(startDate);
            String endTime = simpleDateFormat.format(endDate);
            couponsGainEntity.setStartTime(startTime);
            couponsGainEntity.setEndTime(endTime);
            couponGainVo.setCouponEntity(couponEntity);
            couponGainVo.setCouponsGainEntity(couponsGainEntity);
            couponGainVo.setCouponEntity(couponEntity);
            couponGainVo.setCouponsGainEntity(couponsGainEntity);
            overdue.add(couponGainVo);
        }
        CouponVo couponVo = new CouponVo();
        couponVo.setDotUse(dotUse);
        couponVo.setUse(use);
        couponVo.setOverdue(overdue);
        return couponVo;
    }

    @Override
    public int updateIsUse(int id) throws Exception {
        return couponDao.updateIsUse(id);
    }

    @Override
    public CouponEntity queryCouponByID(int id) throws Exception {
        return couponDao.selectCouponByID(id);
    }

    @Override
    public List<CouponGainVo> queryMeetCoupon(int userID, BigDecimal full) throws Exception {

        List<CouponGainVo> couponGainVos = new ArrayList<>();
        List<CouponsGainEntity> couponsGainEntities = couponDao.selectMeetCoupon(userID);
        for (CouponsGainEntity couponsGainEntity : couponsGainEntities) {
            CouponGainVo couponGainVo = new CouponGainVo();
            couponGainVo.setCouponsGainEntity(couponsGainEntity);
            couponGainVo.setCouponEntity(couponDao.selectCouponByID(couponsGainEntity.getCouponID()));
            couponGainVos.add(couponGainVo);
        }
        return couponGainVos;
    }
}
