package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.CommentDao;
import com.fengfan.bookstore.dao.CommentImgDao;
import com.fengfan.bookstore.entity.CommentEntity;
import com.fengfan.bookstore.entity.CommentImgEntity;
import com.fengfan.bookstore.service.CommentService;
import com.fengfan.bookstore.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName CommentServiceImpl
 * @Author fengfan
 * @Date 2019/4/19 11:59
 * @Description TODO
 * @Version 1.0
 **/

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Autowired
    private CommentImgDao commentImgDao;

    @Override
    public int insertComment(CommentEntity commentEntity) throws Exception {
        return commentDao.insertComment(commentEntity);
    }

    @Override
    public int insertCommentImage(CommentImgEntity commentImgEntity) throws Exception {
        return commentImgDao.insertCommentImage(commentImgEntity);
    }

    @Override
    public List<CommentVo> queryComment(int bookShelvesID) throws Exception {
        List<CommentVo> commentVos = new ArrayList<>();
        List<CommentEntity> commentEntityList = commentDao.selectComments(bookShelvesID);
        for (CommentEntity commentEntity : commentEntityList) {
            CommentVo commentVo = new CommentVo();
            commentVo.setCommentImgEntityList(commentImgDao.selectCommentImage(commentEntity.getId()));
            commentVo.setUserName(commentEntity.getUserName());
            commentVo.setUserUrl(commentEntity.getUserUrl());
            commentVo.setContent(commentEntity.getContent());
            commentVo.setStar(commentEntity.getStar());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(commentEntity.getCreateDate());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String time = simpleDateFormat1.format(date);
            commentVo.setCreateDate(time);
            commentVos.add(commentVo);
        }
        return commentVos;
    }

    @Override
    public List<CommentVo> queryHighReview(int bookShelvesID) throws Exception {
        List<CommentVo> commentVos = new ArrayList<>();
        List<CommentEntity> commentEntityList = commentDao.selectHighReview(bookShelvesID);
        for (CommentEntity commentEntity : commentEntityList) {
            CommentVo commentVo = new CommentVo();
            commentVo.setCommentImgEntityList(commentImgDao.selectCommentImage(commentEntity.getId()));
            commentVo.setUserName(commentEntity.getUserName());
            commentVo.setUserUrl(commentEntity.getUserUrl());
            commentVo.setContent(commentEntity.getContent());
            commentVo.setStar(commentEntity.getStar());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(commentEntity.getCreateDate());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String time = simpleDateFormat1.format(date);
            commentVo.setCreateDate(time);
            commentVos.add(commentVo);
        }
        return commentVos;
    }

    @Override
    public List<CommentVo> queryMediumReview(int bookShelvesID) throws Exception {
        List<CommentVo> commentVos = new ArrayList<>();
        List<CommentEntity> commentEntityList = commentDao.selectMediumReview(bookShelvesID);
        for (CommentEntity commentEntity : commentEntityList) {
            CommentVo commentVo = new CommentVo();
            commentVo.setCommentImgEntityList(commentImgDao.selectCommentImage(commentEntity.getId()));
            commentVo.setUserName(commentEntity.getUserName());
            commentVo.setUserUrl(commentEntity.getUserUrl());
            commentVo.setContent(commentEntity.getContent());
            commentVo.setStar(commentEntity.getStar());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(commentEntity.getCreateDate());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String time = simpleDateFormat1.format(date);
            commentVo.setCreateDate(time);
            commentVos.add(commentVo);
        }
        return commentVos;
    }

    @Override
    public List<CommentVo> queryBadReview(int bookShelvesID) throws Exception {
        List<CommentVo> commentVos = new ArrayList<>();
        List<CommentEntity> commentEntityList = commentDao.selectBadReview(bookShelvesID);
        for (CommentEntity commentEntity : commentEntityList) {
            CommentVo commentVo = new CommentVo();
            commentVo.setCommentImgEntityList(commentImgDao.selectCommentImage(commentEntity.getId()));
            commentVo.setUserName(commentEntity.getUserName());
            commentVo.setUserUrl(commentEntity.getUserUrl());
            commentVo.setContent(commentEntity.getContent());
            commentVo.setStar(commentEntity.getStar());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(commentEntity.getCreateDate());
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String time = simpleDateFormat1.format(date);
            commentVo.setCreateDate(time);
            commentVos.add(commentVo);
        }
        return commentVos;
    }
}
