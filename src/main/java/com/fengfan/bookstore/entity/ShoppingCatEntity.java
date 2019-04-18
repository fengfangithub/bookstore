package com.fengfan.bookstore.entity;

/**
 * @ClassName ShppingCatEntity
 * @Author fengfan
 * @Date 2019/4/6 15:20
 * @Description TODO
 * @Version 1.0
 **/
public class ShoppingCatEntity {
    private int id;  //购物车ID
    private int userID;  //用户ID
    private int bookShelvesID;  //上架图书ID
    private int number;  //数量
    private int isDelete;  //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getBookShelvesID() {
        return bookShelvesID;
    }

    public void setBookShelvesID(int bookShelvesID) {
        this.bookShelvesID = bookShelvesID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
