package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.service.OrderService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.OrderListVo;
import com.fengfan.bookstore.vo.OrderShowVo;
import com.fengfan.bookstore.vo.QueryOrderListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName OrderController
 * @Author fengfan
 * @Date 2019/4/22 18:52
 * @Description TODO
 * @Version 1.0
 **/

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order-list")
    @ResponseBody
    public BaseResponse<QueryOrderListVo> queryOrderList(int userID) {
        try {
            List<OrderListVo> noPay = orderService.queryNoPayOrderList(userID);
            List<OrderListVo> delivery = orderService.queryDeliveryOrderList(userID);
            List<OrderListVo> take = orderService.queryTakeOrderList(userID);
            List<OrderListVo> complete = orderService.queryCompleteOrderList(userID);
            List<OrderListVo> afterSales = orderService.queryAfterSalesOrderList(userID);
            QueryOrderListVo queryOrderListVo = new QueryOrderListVo();
            queryOrderListVo.setNoPay(noPay);
            queryOrderListVo.setDelivery(delivery);
            queryOrderListVo.setTake(take);
            queryOrderListVo.setComplete(complete);
            queryOrderListVo.setAfterSales(afterSales);
            return new BaseResponse<>(StatusCode.ORDER_QUERY_SUCCESS,queryOrderListVo);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }


    @RequestMapping("/order-show")
    @ResponseBody
    public BaseResponse<OrderShowVo> queryOrder(int userID, int bookShelvesID) {
        try {
            OrderShowVo orderShowVo = orderService.queryOrderShow(userID, bookShelvesID);
            return new BaseResponse<>(StatusCode.ORDER_QUERY_SUCCESS, orderShowVo);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
        public BaseResponse deleteOrder(int orderID, int userID) {
        try {
            if (orderService.deleteOrder(userID, orderID) == 1) {
                return new BaseResponse(StatusCode.ORDER_DELETE_SUCCESS);
            }
            return new BaseResponse(StatusCode.ORDER_DELETE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/take-delivery")
    @ResponseBody
    public BaseResponse takeGoods(int orderID, int userID) {
        try {
            if (orderService.updateTakeOrder(userID, orderID) == 1) {
                return new BaseResponse(StatusCode.ORDER_TAKE_SUCCESS);
            }
            return new BaseResponse(StatusCode.ORDER_TAKE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/return-order")
    @ResponseBody
    public BaseResponse returnOrder(int orderID, int userID) {
        try {
            if (orderService.updateReturn(userID, orderID) == 1) {
                return new BaseResponse(StatusCode.ORDER_RETURN_SUCCESS);
            }
            return new BaseResponse(StatusCode.ORDER_RETURN_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/pay-order")
    @ResponseBody
    public BaseResponse payOrder(int orderID, int userID,String password) {
        try {
            int result = orderService.updatePay(userID, orderID,password);
            if (result == 1) {
                return new BaseResponse(StatusCode.ORDER_PAY_SUCCESS);
            }else if(result == 0){
                return new BaseResponse(StatusCode.ORDER_PAY_PASSWORD_FAIL);
            }else{
                return new BaseResponse(StatusCode.ORDER_PAY_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

}
