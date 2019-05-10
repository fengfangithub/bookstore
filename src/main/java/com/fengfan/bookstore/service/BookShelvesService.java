package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.CategoryEntity;
import com.fengfan.bookstore.vo.BookShelvesClassVo;
import com.fengfan.bookstore.vo.BookShelvesVo;
import com.fengfan.bookstore.vo.BookShelvesListVo;
import com.fengfan.bookstore.vo.IndexBookVo;

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
     * @Description 查询上架书分类列表
     * @Exception
     **/
    IndexBookVo queryBookShelvesList() throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 18:13
     * @Paran
     * @Description 模糊查询书籍
     * @Exception
     **/
    List<BookShelvesListVo> queryFuzzyBookShelvesList(String keyword) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/18 17:29
     * @Paran
     * @Description 上架信息
     * @Exception
     **/
    BookShelvesVo queryBookShelves(int bookShelvesID, int UserID) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/9 18:19
     * @Paran
     * @return
     * @Description 查询主页分类列表
     * @Exception
     **/
    IndexBookVo queryIndexBook() throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/9 18:23
     * @Paran
     * @return
     * @Description 根据分类和排序查询书
     * @Exception
     **/
    BookShelvesClassVo queryClassBook(int categoryID) throws Exception;

}
