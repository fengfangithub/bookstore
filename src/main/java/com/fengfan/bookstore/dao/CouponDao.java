package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.CouponEntity;
import com.fengfan.bookstore.entity.CouponsGainEntity;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName CouponDao
 * @Author fengfan
 * @Date 2019/4/23 15:24
 * @Description TODO
 * @Version 1.0
 **/

public interface CouponDao {

    int insertCouPonGain(CouponsGainEntity couponsGainEntity) throws Exception;

    List<CouponEntity> selectCoupon() throws Exception;

    List<CouponsGainEntity> selectDotUse(@Param("userID") int userID) throws Exception;

    List<CouponsGainEntity> selectUse(@Param("userID") int userID) throws Exception;

    List<CouponsGainEntity> selectOverdue(@Param("userID") int userID) throws Exception;

    int deleteCouponsGain(@Param("id") int id) throws Exception;

    int updateIsUse(@Param("id") int id) throws Exception;

    CouponEntity selectCouponByID(@Param("id") int id) throws Exception;

    List<CouponsGainEntity> selectMeetCoupon(@Param("userID") int userID) throws Exception;

}
