package com.fengfan.bookstore.entity;

/**
 * @ClassName CommentImgEntity
 * @Author fengfan
 * @Date 2019/4/14 16:04
 * @Description TODO
 * @Version 1.0
 **/
public class CommentImgEntity {
    private int id;  //评价图片ID
    private String url;  //图片地址
    private int isDelete;  //是否删除
    private int commentID;  //评价ID

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

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }
}
