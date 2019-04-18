package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.CommentEntity;
import com.fengfan.bookstore.entity.CommentImgEntity;
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
     * @Author fengfan
     * @Date 2019/4/16 14:27
     * @Paran
     * @return
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
    int intsertComment(CommentEntity commentEntity) throws Exception;

}
