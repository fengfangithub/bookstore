package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.AddressDao;
import com.fengfan.bookstore.entity.AddressEntity;
import com.fengfan.bookstore.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AddressServiceImpl
 * @Author fengfan
 * @Date 2019/4/20 13:07
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;

    @Override
    public int insertAddress(AddressEntity addressEntity) throws Exception {
        System.out.println(addressEntity.getDetailedAddress());
        return addressDao.insertAddress(addressEntity);
    }

    @Override
    public int updateAddress(AddressEntity addressEntity) throws Exception {
        return addressDao.updateAddress(addressEntity);
    }

    @Override
    public int deleteAddress(int addressID) throws Exception {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setId(addressID);
        return addressDao.deleteAddress(addressEntity);
    }

    @Override
    public List<AddressEntity> queryAddressList(int userID) throws Exception {
        return addressDao.selectAddressList(userID);
    }

    @Override
    public int updateDefault(int addressID,int userID) throws Exception {
        AddressEntity addressEntity1 = addressDao.selectDefaultAddress(userID);
        AddressEntity addressEntity = new AddressEntity();
        if(addressEntity1 != null){
            int addressDefaultID = addressEntity1.getId();
            System.out.println(addressDefaultID);
            addressEntity.setId(addressDefaultID);
            addressEntity.setIsDefault(1);
            addressDao.updateDefault(addressEntity);
        }
        addressEntity.setId(addressID);
        addressEntity.setIsDefault(2);
        return addressDao.updateDefault(addressEntity);
    }

    @Override
    public AddressEntity queryAddress(int addressID) throws Exception {
        return addressDao.selectAddress(addressID);
    }

    @Override
    public AddressEntity queryDefaultAddress(int userID) throws Exception {
        return addressDao.selectDefaultAddress(userID);
    }
}
