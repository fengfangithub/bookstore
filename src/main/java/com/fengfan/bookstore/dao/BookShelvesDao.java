package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.BookShelvesEntity;
import com.fengfan.bookstore.entity.DetailedEntity;
import com.fengfan.bookstore.entity.ShowImgEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName BookShelvesDao
 * @Author fengfan
 * @Date 2019/4/14 14:55
 * @Description 上架书籍持久层
 * @Version 1.0
 **/

public interface BookShelvesDao {

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 15:05
     * @Paran categoryID
     * @Description 根据分类ID查询书籍
     * @Exception Exception
     **/
    List<BookShelvesEntity> selectBookShelvesList(@Param("categoryID") int categoryID, @Param("start") int start, @Param("offset") int offset) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 15:13
     * @Paran
     * @Description 模糊查询上架书籍列表
     * @Exception
     **/
    List<BookShelvesEntity> selectFuzzyBookShelvesList(@Param("keyword") String keyword, @Param("start") int start, @Param("offset") int offset);

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 15:25
     * @Paran
     * @Description 上架信息
     * @Exception
     **/
    BookShelvesEntity selectBookShelvesInfo(@Param("bookShelvesID") int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 15:35
     * @Paran
     * @Description 查询上架书展示图片
     * @Exception
     **/
    List<ShowImgEntity> selectShowImg(@Param("bookShelvesID") int bookShelvesID) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 15:36
     * @Paran
     * @Description 查询上架书详细展示图片
     * @Exception
     **/
    List<DetailedEntity> selectDetailed(@Param("bookShelvesID") int bookShelvesID) throws Exception;

}
