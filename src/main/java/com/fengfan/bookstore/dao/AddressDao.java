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
    List<AddressEntity> selectAddress(@Param("userID") int userID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/16 15:07
     * @Paran
     * @return
     * @Description 添加一个地址信息
     * @Exception
     **/
    int insertAddress(AddressEntity addressEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/4/16 15:08
     * @Paran
     * @return
     * @Description 修改地址信息
     * @Exception
     **/
    int udateAddress(AddressEntity addressEntity) throws Exception;
}
