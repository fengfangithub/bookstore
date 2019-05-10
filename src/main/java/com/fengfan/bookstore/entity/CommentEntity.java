package com.fengfan.bookstore.entity;

import java.util.List;

/**
 * @ClassName CommentEntity
 * @Author fengfan
 * @Date 2019/4/6 14:25
 * @Description 评价实体类
 * @Version 1.0
 **/
public class CommentEntity {
    private int id;  //评价ID
    private String userName;  //评价用户名
    private String userUrl;  //评价用户头像
    private int star;  //评价星级
    private String content;  //评价内容
    private String createDate;  //评价时间
    private int bookShelvesID;  //上架商品ID
    private int isDelete; //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getBookShelvesID() {
        return bookShelvesID;
    }

    public void setBookShelvesID(int bookShelvesID) {
        this.bookShelvesID = bookShelvesID;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
