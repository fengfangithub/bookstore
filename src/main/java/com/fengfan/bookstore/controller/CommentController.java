package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.CommentEntity;
import com.fengfan.bookstore.entity.CommentImgEntity;
import com.fengfan.bookstore.entity.OrderEntity;
import com.fengfan.bookstore.service.CommentService;
import com.fengfan.bookstore.service.OrderService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @ClassName CommentController
 * @Author fengfan
 * @Date 2019/4/19 12:36
 * @Description TODO
 * @Version 1.0
 **/

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add-image")
    @ResponseBody
    public BaseResponse addCommentImage(@RequestParam("file") MultipartFile file, int commentID, HttpServletRequest request) {
        try {
            String path = request.getSession().getServletContext().getRealPath("imag/comment");
            File fileDir = new File(path);
            if(!fileDir.exists()){
                fileDir.mkdirs();
            }
            if (!file.isEmpty()) {
                String fileName = file.getOriginalFilename();
                file.transferTo(new File(path + File.separator + fileName));
                CommentImgEntity commentImgEntity = new CommentImgEntity();
                commentImgEntity.setCommentID(commentID);
                commentImgEntity.setUrl("https://fengfan.xhban.com/bookstore/imag/comment/" + fileName);
                commentService.insertCommentImage(commentImgEntity);
                return new BaseResponse(StatusCode.COMMENT_IMAGE_ADD_SUCCESS);
            } else {
                return new BaseResponse(StatusCode.COMMENT_IMAGE_ADD_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/add")
    @ResponseBody
    public BaseResponse<Integer> addComment(String userName, String userUrl, int star, String content, int orderID, HttpServletRequest request) {
        try {
            OrderEntity orderEntity = orderService.queryOrder(orderID);
            OrderEntity orderEntityUpdate = new OrderEntity();
            orderEntityUpdate.setId(orderID);
            orderEntityUpdate.setIsComment(2);
            orderEntityUpdate.setUserID(orderEntity.getUserID());
            orderService.updateComment(orderEntityUpdate);
            CommentEntity commentEntity = new CommentEntity();
            commentEntity.setBookShelvesID(orderEntity.getBookShelvesID());
            commentEntity.setUserName(userName);
            commentEntity.setUserUrl(userUrl);
            commentEntity.setContent(content);
            commentEntity.setStar(star);
            int result = commentService.insertComment(commentEntity);
            if (result == 1) {
                return new BaseResponse<>(StatusCode.COMMENT_ADD_SUCCESS, commentEntity.getId());
            } else {
                return new BaseResponse<>(StatusCode.COMMENT_ADD_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/list")
    @ResponseBody
    public BaseResponse<List<CommentVo>> queryComment(int bookShelvesID) {
        try {
            List<CommentVo> commentVos = commentService.queryComment(bookShelvesID);
            if (commentVos.size() > 0) {
                return new BaseResponse<>(StatusCode.COMMENT_QUERY_SUCCESS, commentVos);
            }
            return new BaseResponse<>(StatusCode.COMMENT_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/list-high")
    @ResponseBody
    public BaseResponse<List<CommentVo>> queryHighReview(int bookShelvesID) {
        try {
            List<CommentVo> commentVos = commentService.queryHighReview(bookShelvesID);
            if (commentVos.size() > 0) {
                return new BaseResponse<>(StatusCode.COMMENT_QUERY_SUCCESS, commentVos);
            }
            return new BaseResponse<>(StatusCode.COMMENT_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/list-medium")
    @ResponseBody
    public BaseResponse<List<CommentVo>> queryMediumReview(int bookShelvesID) {
        try {
            List<CommentVo> commentVos = commentService.queryMediumReview(bookShelvesID);
            if (commentVos.size() > 0) {
                return new BaseResponse<>(StatusCode.COMMENT_QUERY_SUCCESS, commentVos);
            }
            return new BaseResponse<>(StatusCode.COMMENT_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/list-bad")
    @ResponseBody
    public BaseResponse<List<CommentVo>> queryBadReview(int bookShelvesID) {
        try {
            List<CommentVo> commentVos = commentService.queryBadReview(bookShelvesID);
            if (commentVos.size() > 0) {
                return new BaseResponse<>(StatusCode.COMMENT_QUERY_SUCCESS, commentVos);
            }
            return new BaseResponse<>(StatusCode.COMMENT_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

}
