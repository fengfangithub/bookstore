package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.CommentImgEntity;

import java.util.List;

/**
 * @ClassName CommentVo
 * @Author fengfan
 * @Date 2019/4/19 11:51
 * @Description TODO
 * @Version 1.0
 **/
public class CommentVo {
    private String userName;  //评价用户名
    private String userUrl;  //评价用户头像
    private int star;  //评价星级
    private String content;  //评价内容
    private String createDate;  //评价时间
    private List<CommentImgEntity> commentImgEntityList;  //评价图片

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

    public List<CommentImgEntity> getCommentImgEntityList() {
        return commentImgEntityList;
    }

    public void setCommentImgEntityList(List<CommentImgEntity> commentImgEntityList) {
        this.commentImgEntityList = commentImgEntityList;
    }
}
