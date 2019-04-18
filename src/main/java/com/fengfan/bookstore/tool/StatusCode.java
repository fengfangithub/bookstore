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
    EXCEPTION(-1,"未知错误"),

    USER_LOGIN_SUCCESS(1011,"登陆成功"),
    USER_LOGIN_EXIST(1012,"用户不存在"),

    USER_ADD_SUCCESS(1021,"添加成功"),
    USER_ADD_FAIL(1022,"添加失败"),

    USER_RECHARGE_SUCCESS(1031,"充值成功"),
    USER_RECHARGE_FAIL(1032,"充值失败"),

    USER_PAY_SUCCESS(1041,"支付成功"),
    USER_PAY_FAIL(1042,"支付失败"),

    USER_ADD_POINTS_SUCCESS(1051,"获得积分成功"),
    USER_ADD_POINTS_FAIL(1052,"获得积分失败"),

    USER_SUBTRACT_POINTS_SUCCESS(1051,"扣除积分成功"),
    USER_SUBTRACT_POINTS_FAIL(1052,"扣除积分失败"),

    BOOK_QUERY_SUCCESS(2011,"查询成功"),
    BOOK_QUERY_FAIL(2011,"查询失败")
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
