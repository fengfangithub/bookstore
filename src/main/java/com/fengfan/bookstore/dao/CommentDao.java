package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.CommentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CommentDao
 * @Author fengfan
 * @Date 2019/4/14 15:57
 * @Description 用户评价持久层
 * @Version 1.0
 **/

public interface CommentDao {

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/16 14:27
     * @Paran
     * @Description 查询上架书籍的评论
     * @Exception
     **/
    List<CommentEntity> selectComments(@Param("bookShelvesID") int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 16:08
     * @Paran
     * @Description 插入一条评论
     * @Exception
     **/
    int insertComment(CommentEntity commentEntity) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 11:30
     * @Paran
     * @Description 查询好评
     * @Exception
     **/
    List<CommentEntity> selectHighReview(@Param("bookShelvesID") int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 11:31
     * @Paran
     * @Description 查询中评
     * @Exception
     **/
    List<CommentEntity> selectMediumReview(@Param("bookShelvesID") int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/19 11:32
     * @Paran
     * @Description 查询差评
     * @Exception
     **/
    List<CommentEntity> selectBadReview(@Param("bookShelvesID") int bookShelvesID) throws Exception;

}
