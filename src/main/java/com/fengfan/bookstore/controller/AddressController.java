package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.AddressEntity;
import com.fengfan.bookstore.service.AddressService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @ClassName AddressController
 * @Author fengfan
 * @Date 2019/4/20 13:10
 * @Description TODO
 * @Version 1.0
 **/

@Controller
@RequestMapping("/address")
@ResponseBody
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/add")
    public BaseResponse addAddress(AddressEntity addressEntity) {
        try {
            int result = addressService.insertAddress(addressEntity);
            if (result == 1) {
                return new BaseResponse(StatusCode.ADDRESS_ADD_SUCCESS);
            }
            return new BaseResponse(StatusCode.ADDRESS_ADD_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/update")
    public BaseResponse updateAddress(AddressEntity addressEntity) {
        try {
            int result = addressService.updateAddress(addressEntity);
            if (result > 0) {
                return new BaseResponse(StatusCode.ADDRESS_UPDATE_SUCCESS);
            }
            return new BaseResponse(StatusCode.ADDRESS_UPDATE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/delete")
    public BaseResponse deleteAddress(int addressID) {
        try {
            int result = addressService.deleteAddress(addressID);
            if (result == 1) {
                return new BaseResponse(StatusCode.ADDRESS_DELETE_SUCCESS);
            }
            return new BaseResponse(StatusCode.ADDRESS_DELETE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/list")
    public BaseResponse<List<AddressEntity>> queryAddressList(int userID) {
        try {
            List<AddressEntity> addressEntities = addressService.queryAddressList(userID);
            if (addressEntities.size() > 0) {
                return new BaseResponse<>(StatusCode.ADDRESS_QUERY_SUCCESS, addressEntities);
            }
            return new BaseResponse<>(StatusCode.ADDRESS_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/info")
    public BaseResponse<AddressEntity> queryAddress(int addressID) {
        try {
            AddressEntity addressEntity = addressService.queryAddress(addressID);
            if (addressEntity != null) {
                return new BaseResponse<>(StatusCode.ADDRESS_QUERY_SUCCESS, addressEntity);
            }
            return new BaseResponse<>(StatusCode.ADDRESS_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/default")
    public BaseResponse updateDefault(int addressID,int userID){
        try {
            int result = addressService.updateDefault(addressID,userID);
            if (result > 0) {
                return new BaseResponse(StatusCode.ADDRESS_UPDATE_SUCCESS);
            }
            return new BaseResponse(StatusCode.ADDRESS_UPDATE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/query-default")
    public BaseResponse<AddressEntity> queryDefault(int userID){
        try {
            AddressEntity addressEntity = addressService.queryDefaultAddress(userID);
            return new BaseResponse<>(StatusCode.ADDRESS_QUERY_SUCCESS,addressEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

}
