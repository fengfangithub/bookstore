package com.fengfan.bookstore.vo;

import java.util.List;

/**
 * @ClassName QueryOrderListVo
 * @Author fengfan
 * @Date 2019/5/3 18:56
 * @Description TODO
 * @Version 1.0
 **/
public class QueryOrderListVo {
    private List<OrderListVo> noPay;
    private List<OrderListVo> delivery;
    private List<OrderListVo> take;
    private List<OrderListVo> complete;
    private List<OrderListVo> afterSales;

    public List<OrderListVo> getNoPay() {
        return noPay;
    }

    public void setNoPay(List<OrderListVo> noPay) {
        this.noPay = noPay;
    }

    public List<OrderListVo> getDelivery() {
        return delivery;
    }

    public void setDelivery(List<OrderListVo> delivery) {
        this.delivery = delivery;
    }

    public List<OrderListVo> getTake() {
        return take;
    }

    public void setTake(List<OrderListVo> take) {
        this.take = take;
    }

    public List<OrderListVo> getComplete() {
        return complete;
    }

    public void setComplete(List<OrderListVo> complete) {
        this.complete = complete;
    }

    public List<OrderListVo> getAfterSales() {
        return afterSales;
    }

    public void setAfterSales(List<OrderListVo> afterSales) {
        this.afterSales = afterSales;
    }
}
