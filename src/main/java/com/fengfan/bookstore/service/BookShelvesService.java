package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.CategoryEntity;
import com.fengfan.bookstore.vo.BookShelvesVo;
import com.fengfan.bookstore.vo.BookShelvesVoList;

import java.util.List;

/**
 * @ClassName BookShevlvesService
 * @Author fengfan
 * @Date 2019/4/18 16:04
 * @Description TODO
 * @Version 1.0
 **/

public interface BookShelvesService {

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 16:14
     * @Paran
     * @Description 查询书籍分类
     * @Exception
     **/
    List<CategoryEntity> queryCategory() throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 16:12
     * @Paran
     * @Description 查询上架书列表
     * @Exception
     **/
    List<BookShelvesVoList> queryBookShelvesList(int categoryID, int page) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 18:13
     * @Paran
     * @Description 模糊查询书籍
     * @Exception
     **/
    List<BookShelvesVoList> queryFuzzyBookShelvesList(String keyword, int page) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 17:29
     * @Paran
     * @Description 上架信息
     * @Exception
     **/
    BookShelvesVo queryBookShelves(int bookShelvesID) throws Exception;

}
