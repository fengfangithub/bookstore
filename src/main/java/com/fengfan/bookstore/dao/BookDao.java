package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.BookEntity;
import org.apache.ibatis.annotations.Param;



/**
 * @ClassName BookDao
 * @Author fengfan
 * @Date 2019/4/14 11:50
 * @Description 书籍信息持久层
 * @Version 1.0
 **/

public interface BookDao {
    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 14:45
     * @Paran
     * @Description 根据ID查询书籍详细信息
     * @Exception
     **/
    BookEntity selectBookInfo(@Param("bookID") int bookID) throws Exception;

    int insertBook(BookEntity bookEntity) throws Exception;

}
