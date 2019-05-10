package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.CommentEntity;
import com.fengfan.bookstore.entity.CommentImgEntity;
import com.fengfan.bookstore.vo.CommentVo;

import java.util.List;

/**
 * @ClassName CommentService
 * @Author fengfan
 * @Date 2019/4/19 11:41
 * @Description TODO
 * @Version 1.0
 **/
public interface CommentService {

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 11:42
     * @Paran
     * @Description 插入一条评论
     * @Exception
     **/
    int insertComment(CommentEntity commentEntity) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 12:49
     * @Paran
     * @Description 插入评论图片
     * @Exception
     **/
    int insertCommentImage(CommentImgEntity commentImgEntity) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 11:53
     * @Paran
     * @Description 查询评论
     * @Exception
     **/
    List<CommentVo> queryComment(int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 12:22
     * @Paran
     * @Description 查询好评
     * @Exception
     **/
    List<CommentVo> queryHighReview(int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 12:22
     * @Paran
     * @Description 查询中评
     * @Exception
     **/
    List<CommentVo> queryMediumReview(int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 12:22
     * @Paran
     * @Description 查询差评
     * @Exception
     **/
    List<CommentVo> queryBadReview(int bookShelvesID) throws Exception;

}
