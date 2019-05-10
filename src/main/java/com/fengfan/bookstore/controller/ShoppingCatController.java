package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.ShoppingCatEntity;
import com.fengfan.bookstore.service.ShoppingCatService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.ShoppingCatVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName ShoppingCatController
 * @Author fengfan
 * @Date 2019/4/23 15:18
 * @Description TODO
 * @Version 1.0
 **/
@Controller
@RequestMapping("/shopping")
@ResponseBody
public class ShoppingCatController {

    @Autowired
    private ShoppingCatService shoppingCatService;

    @RequestMapping("/add")
    public BaseResponse addShopping(ShoppingCatEntity shoppingCatEntity) {
        try {
            int result = shoppingCatService.insertShoppingCat(shoppingCatEntity);
            if (result == 1) {
                return new BaseResponse(StatusCode.SHOPPING_ADD_SUCCESS);
            }
            return new BaseResponse(StatusCode.SHOPPING_ADD_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/list")
    public BaseResponse<List<ShoppingCatVo>> queryShopping(int userID) {
        try {
            List<ShoppingCatVo> shoppingCatVos = shoppingCatService.queryShoppingCat(userID);
            if (shoppingCatVos.size() > 0) {
                return new BaseResponse<>(StatusCode.SHOPPING_QUERY_SUCCESS, shoppingCatVos);
            }
            return new BaseResponse<>(StatusCode.SHOPPING_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/delete")
    public BaseResponse deleteShopping(int id) {
        try {
            int result = shoppingCatService.deleteShoppingCat(id);
            if (result == 1) {
                return new BaseResponse(StatusCode.SHOPPING_DELETE_SUCCESS);
            }
            return new BaseResponse(StatusCode.SHOPPING_DELETE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

}
