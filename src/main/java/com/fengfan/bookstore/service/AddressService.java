package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.AddressEntity;

import java.util.List;

/**
 * @ClassName AddressService
 * @Author fengfan
 * @Date 2019/4/20 12:57
 * @Description TODO
 * @Version 1.0
 **/
public interface AddressService {

    /**
     * @Author fengfan
     * @Date 2019/4/20 13:01
     * @Paran
     * @return
     * @Description 插入一个地址
     * @Exception
     **/
    int insertAddress(AddressEntity addressEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/20 13:04
     * @Paran
     * @return
     * @Description 修改地址信息
     * @Exception
     **/
    int updateAddress(AddressEntity addressEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/20 13:04
     * @Paran
     * @return
     * @Description 删除地址信息
     * @Exception
     **/
    int deleteAddress(int addressID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/20 13:19
     * @Paran
     * @return
     * @Description 查询地址列表
     * @Exception
     **/
    List<AddressEntity> queryAddressList(int userID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/20 13:21
     * @Paran
     * @return
     * @Description 修改默认地址
     * @Exception
     **/
    int updateDefault(int addressID,int userID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/20 13:25
     * @Paran
     * @return
     * @Description 根据id查询地址信息
     * @Exception
     **/
    AddressEntity queryAddress(int addressID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/9 20:00
     * @Paran
     * @return
     * @Description 查询用户默认地址
     * @Exception
     **/
    AddressEntity queryDefaultAddress(int userID) throws Exception;
}
