package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.BookShelvesEntity;
import com.fengfan.bookstore.entity.DetailedEntity;
import com.fengfan.bookstore.entity.IndexBookEntity;
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
    List<IndexBookEntity> selectClassBook(@Param("categoryID") int categoryID) throws Exception;


    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 15:13
     * @Paran
     * @Description 模糊查询上架书籍列表
     * @Exception
     **/
    List<BookShelvesEntity> selectFuzzyBookShelvesList(@Param("keyword") String keyword);

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
     * @Author fengfan
     * @Date 2019/5/9 16:52
     * @Paran
     * @return
     * @Description 修改销量
     * @Exception
     **/
    int updateSales(BookShelvesEntity bookShelvesEntity) throws Exception;


    /**
     * @Author fengfan
     * @Date 2019/5/9 16:52
     * @Paran
     * @return
     * @Description 新添上架书
     * @Exception
     **/
    int insertBookShelves(BookShelvesEntity bookShelvesEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/9 18:38
     * @Paran
     * @return
     * @Description 修改上架书信息
     * @Exception
     **/
    int updateBookShelves(BookShelvesEntity bookShelvesEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/13 14:02
     * @Paran
     * @return
     * @Description 插入展示图片
     * @Exception
     **/
    int insertShowImage(ShowImgEntity showImgEntity) throws Exception;

    /**
     * @Author fengfan
     * @Date 2019/5/13 14:03
     * @Paran
     * @return
     * @Description 插入详细图片
     * @Exception
     **/
    int insertDetailed(DetailedEntity detailedEntity) throws Exception;

    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 15:36
     * @Paran
     * @Description 查询上架书详细展示图片
     * @Exception
     **/
    List<DetailedEntity> selectDetailed(@Param("bookShelvesID") int bookShelvesID) throws Exception;

    List<IndexBookEntity> selectBookShelvesByDefault(@Param("categoryID") int categoryID) throws Exception;
    List<IndexBookEntity> selectBookShelvesByTime(@Param("categoryID") int categoryID) throws Exception;
    List<IndexBookEntity> selectBookShelvesBySales(@Param("categoryID") int categoryID) throws Exception;
    List<IndexBookEntity> selectBookShelvesByPrice(@Param("categoryID") int categoryID) throws Exception;

    List<IndexBookEntity> selectIndexBook(@Param("categoryID") int categoryID) throws Exception;

}
