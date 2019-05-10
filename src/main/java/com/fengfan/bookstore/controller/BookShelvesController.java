package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.CategoryEntity;
import com.fengfan.bookstore.service.BookShelvesService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.BookShelvesClassVo;
import com.fengfan.bookstore.vo.BookShelvesListVo;
import com.fengfan.bookstore.vo.BookShelvesVo;
import com.fengfan.bookstore.vo.IndexBookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName BookShelvesController
 * @Author fengfan
 * @Date 2019/4/18 16:31
 * @Description TODO
 * @Version 1.0
 **/
@Controller
@RequestMapping("/book")
public class BookShelvesController {

    @Autowired
    private BookShelvesService bookShelvesService;

    @RequestMapping("/class")
    @ResponseBody
    public BaseResponse<List<CategoryEntity>> queryCategory() {
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS, bookShelvesService.queryCategory());
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }

    @RequestMapping("/shelves-list")
    @ResponseBody
    public BaseResponse<IndexBookVo> queryBookShelvesList() {
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS, bookShelvesService.queryBookShelvesList());
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }

    @RequestMapping("/shelves")
    @ResponseBody
    public BaseResponse<BookShelvesVo> queryBookShelves(int bookShelvesID,int userID) {
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS, bookShelvesService.queryBookShelves(bookShelvesID,userID));
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }

    @RequestMapping("/index-book")
    @ResponseBody
    public BaseResponse<IndexBookVo> queryIndexBookShelves() {
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS, bookShelvesService.queryIndexBook());
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }

    @RequestMapping("/class-book")
    @ResponseBody
    public BaseResponse<BookShelvesClassVo> queryClassBookShelves(int categoryID) {
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS, bookShelvesService.queryClassBook(categoryID));
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }

    @RequestMapping("/fuzzy-list")
    @ResponseBody
    public BaseResponse<List<BookShelvesListVo>> queryFuzzyBookShelvesList(String keyword) {
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS, bookShelvesService.queryFuzzyBookShelvesList(keyword));
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }
}
