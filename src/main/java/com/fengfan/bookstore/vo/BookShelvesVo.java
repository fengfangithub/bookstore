package com.fengfan.bookstore.vo;

import com.fengfan.bookstore.entity.*;

import java.util.List;

/**
 * @ClassName BookShelvesVo
 * @Author fengfan
 * @Date 2019/4/18 17:15
 * @Description TODO
 * @Version 1.0
 **/
public class BookShelvesVo {
    private BookShelvesEntity bookShelvesEntity;
    private BookEntity bookEntity;
    private List<ShowImgEntity> showImgEntityList;
    private List<DetailedEntity> detailedEntityList;
    private List<CommentVo> allComment;
    private List<CommentVo> highComment;
    private List<CommentVo> mediumComment;
    private List<CommentVo> badComment;
    private CollectionEntity collectionEntity;

    public BookShelvesEntity getBookShelvesEntity() {
        return bookShelvesEntity;
    }

    public void setBookShelvesEntity(BookShelvesEntity bookShelvesEntity) {
        this.bookShelvesEntity = bookShelvesEntity;
    }

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }

    public List<ShowImgEntity> getShowImgEntityList() {
        return showImgEntityList;
    }

    public void setShowImgEntityList(List<ShowImgEntity> showImgEntityList) {
        this.showImgEntityList = showImgEntityList;
    }

    public List<DetailedEntity> getDetailedEntityList() {
        return detailedEntityList;
    }

    public void setDetailedEntityList(List<DetailedEntity> detailedEntityList) {
        this.detailedEntityList = detailedEntityList;
    }


    public List<CommentVo> getAllComment() {
        return allComment;
    }

    public void setAllComment(List<CommentVo> allComment) {
        this.allComment = allComment;
    }

    public List<CommentVo> getHighComment() {
        return highComment;
    }

    public void setHighComment(List<CommentVo> highComment) {
        this.highComment = highComment;
    }

    public List<CommentVo> getMediumComment() {
        return mediumComment;
    }

    public void setMediumComment(List<CommentVo> mediumComment) {
        this.mediumComment = mediumComment;
    }

    public List<CommentVo> getBadComment() {
        return badComment;
    }

    public void setBadComment(List<CommentVo> badComment) {
        this.badComment = badComment;
    }

    public CollectionEntity getCollectionEntity() {
        return collectionEntity;
    }

    public void setCollectionEntity(CollectionEntity collectionEntity) {
        this.collectionEntity = collectionEntity;
    }
}
