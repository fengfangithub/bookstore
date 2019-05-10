package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.AddressEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName Address
 * @Author fengfan
 * @Date 2019/4/16 15:04
 * @Description 地址管理持久层
 * @Version 1.0
 **/

public interface AddressDao {
    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/16 15:05
     * @Paran
     * @Description 查询地址列表
     * @Exception
     **/
    List<AddressEntity> selectAddressList(@Param("userID") int userID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/20 13:22
     * @Paran
     * @Description 根据默认地址查询地址信息
     * @Exception
     **/
    AddressEntity selectDefaultAddress(@Param("userID") int userID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/22 15:42
     * @Paran
     * @Description 根据ID查询地址信息
     * @Exception
     **/
    AddressEntity selectAddress(@Param("addressID") int addressID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/16 15:07
     * @Paran
     * @Description 添加一个地址信息
     * @Exception
     **/
    int insertAddress(AddressEntity addressEntity) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/16 15:08
     * @Paran
     * @Description 修改地址信息
     * @Exception
     **/
    int updateAddress(AddressEntity addressEntity) throws Exception;

    int updateDefault(AddressEntity addressEntity) throws Exception;

    int deleteAddress(AddressEntity addressEntity) throws Exception;
}
