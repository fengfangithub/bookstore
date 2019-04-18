package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.CategoryEntity;
import com.fengfan.bookstore.service.BookShelvesService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.BookShelvesVo;
import com.fengfan.bookstore.vo.BookShelvesVoList;
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
    public BaseResponse<List<CategoryEntity>> queryCategory(){
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS,bookShelvesService.queryCategory());
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }

    @RequestMapping("/shelves-list")
    @ResponseBody
    public BaseResponse<List<BookShelvesVoList>> queryBookShelvesList(int categoryID, int page){
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS,bookShelvesService.queryBookShelvesList(categoryID,page));
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }

    @RequestMapping("/shelves")
    @ResponseBody
    public BaseResponse<BookShelvesVo> queryBookShelves(int bookShelvesID){
        try {
            return new BaseResponse<>(StatusCode.BOOK_QUERY_SUCCESS,bookShelvesService.queryBookShelves(bookShelvesID));
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.BOOK_QUERY_FAIL);
        }
    }
}
