package com.fengfan.bookstore.entity;

/**
 * @ClassName CollectionEntity
 * @Author fengfan
 * @Date 2019/4/6 13:58
 * @Description 收藏实体类
 * @Version 1.0
 **/
public class CollectionEntity {
    private int id;  //收藏ID
    private int bookShelvesID;  //上架商品ID
    private int userID;  //用户ID
    private int isDelete;  //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookShelvesID() {
        return bookShelvesID;
    }

    public void setBookShelvesID(int bookShelvesID) {
        this.bookShelvesID = bookShelvesID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
