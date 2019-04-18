package com.fengfan.bookstore.entity;

/**
 * @ClassName DetailedEntity
 * @Author fengfan
 * @Date 2019/4/6 14:51
 * @Description 上架图书详细信息
 * @Version 1.0
 **/
public class DetailedEntity {
    private int id;  //详细ID
    private String url;  //详细的图片url
    private int bookShelvesID;  //上架图书ID
    private int isDelete;  //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
