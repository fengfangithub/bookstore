package com.fengfan.bookstore.tool;

/**
 * @Author fengfan
 * @Date 2019/4/17 16:35
 * @Description 返回数据状态码
 **/
public enum StatusCode {

    /**
     * @Author fengfan
     * @Date 2019/4/17 16:41
     * @Description 请求状态码
     **/
    EXCEPTION(-1, "未知错误"),

    USER_LOGIN_SUCCESS(1011, "登陆成功"),
    USER_LOGIN_EXIST(1012, "用户不存在"),

    USER_ADD_SUCCESS(1021, "添加成功"),
    USER_ADD_FAIL(1022, "添加失败"),

    USER_RECHARGE_SUCCESS(1031, "充值成功"),
    USER_RECHARGE_FAIL(1032, "充值失败"),
    USER_RECHARGE_PASSWORD_FAIL(1033, "密码错误"),

    USER_PAY_SUCCESS(1041, "支付成功"),
    USER_PAY_FAIL(1042, "支付失败"),
    USER_PAY_LACK(1043, "余额不足"),
    USER_PAY_PASSWORD_FAIL(1044, "密码错误"),

    BOOK_QUERY_SUCCESS(2011, "查询成功"),
    BOOK_QUERY_FAIL(2012, "暂无相关书籍"),

    COMMENT_ADD_SUCCESS(2021, "评论添加成功"),
    COMMENT_ADD_FAIL(2022, "评论添加失败"),

    COMMENT_IMAGE_ADD_SUCCESS(2041,"评论图片添加成功"),
    COMMENT_IMAGE_ADD_FAIL(2042,"评论图片添加失败"),

    COMMENT_QUERY_SUCCESS(2031, "查询评论成功"),
    COMMENT_QUERY_FAIL(2032, "暂无相关评论"),

    ADDRESS_ADD_SUCCESS(3011, "地址添加成功"),
    ADDRESS_ADD_FAIL(3012, "地址添加失败"),

    ADDRESS_UPDATE_SUCCESS(3021, "地址修改成功"),
    ADDRESS_UPDATE_FAIL(3022, "地址修改失败"),

    ADDRESS_DELETE_SUCCESS(3031, "地址删除成功"),
    ADDRESS_DELETE_FAIL(3032, "地址删除失败"),

    ADDRESS_QUERY_SUCCESS(3041, "地址查询成功"),
    ADDRESS_QUERY_FAIL(3042, "暂无相关地址"),

    ORDER_QUERY_SUCCESS(4011, "查询成功"),
    ORDER_QUERY_FAIL(4012, "暂无相关订单"),

    ORDER_DELETE_SUCCESS(4021, "删除订单成功"),
    ORDER_DELETE_FAIL(4022, "删除订单失败"),

    ORDER_TAKE_SUCCESS(4031, "收货成功"),
    ORDER_TAKE_FAIL(4032, "收货失败"),

    ORDER_RETURN_SUCCESS(4041, "退货成功"),
    ORDER_RETURN_FAIL(4042, "退货失败"),

    ORDER_PAY_SUCCESS(4051, "支付成功"),
    ORDER_PAY_FAIL(4052, "支付失败"),
    ORDER_PAY_PASSWORD_FAIL(4053, "密码错误"),

    COLLECTION_ADD_SUCCESS(5011, "收藏成功"),
    COLLECTION_ADD_FAIL(5012, "收藏失败"),

    COLLECTION_DELETE_SUCCESS(5021, "删除成功"),
    COLLECTION_DELETE_FAIL(5022, "删除失败"),

    COLLECTION_QUERY_SUCCESS(5031, "查询成功"),
    COLLECTION_QUERY_FAIL(5032, "暂无相关收藏"),

    SHOPPING_ADD_SUCCESS(6011, "加入购物车成功"),
    SHOPPING_ADD_FAIL(6012, "加入购物车失败"),

    SHOPPING_DELETE_SUCCESS(6021, "删除成功"),
    SHOPPING_DELETE_FAIL(6022, "删除失败"),

    SHOPPING_QUERY_SUCCESS(6031, "查询成功"),
    SHOPPING_QUERY_FAIL(6032, "暂无相关记录"),

    COUPON_QUERY_SUCCESS(7011, "优惠券查询成功"),
    COUPON_QUERY_FAIL(7012, "优惠券查询失败"),

    COUPON_INSERT_SUCCESS(7021, "优惠券获取成功"),
    COUPON_INSERT_NOT(7023, "积分不足"),
    COUPON_INSERT_FAIL(7022, "优惠券获取成功"),

    ADMIN_INSERT_SHELVES_SUCCESS(8011,"上架成功"),
    ADMIN_INSERT_BOOK_SUCCESS(8021,"添加成功"),
    ADMIN_LOGIN_SUCCESS(8031,"登陆成功"),
    ADMIN_LOGIN_FAIL(8032,"登陆失败"),
    ADMIN_DELIVERY_SUCCESS(8041,"发货成功"),
    ADMIN_DELIVERY_FAIL(8042,"发货失败"),
    ADMIN_REFUND_SUCCESS(8051,"退货成功"),
    ADMIN_REFUND_FAIL(8052,"退货失败"),
    ADMIN_UPDATE_SUCCESS(8061,"修改成功"),
    ADMIN_UPDATE_FAIL(8062,"修改失败")
    ;

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
