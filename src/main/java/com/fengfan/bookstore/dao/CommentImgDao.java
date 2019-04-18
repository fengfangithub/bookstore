package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.CommentImgEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CommentImgDao
 * @Author fengfan
 * @Date 2019/4/16 14:38
 * @Description TODO
 * @Version 1.0
 **/

public interface CommentImgDao {
    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/16 14:41
     * @Paran
     * @Description 根据评论ID查询评论图片
     * @Exception
     **/
    List<CommentImgEntity> selectComentImgs(@Param("commentID") int commentID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 16:10
     * @Paran
     * @Description 插入用户评价图片
     * @Exception
     **/
    int insertCommentImg(CommentImgEntity commentImgEntity) throws Exception;
}
