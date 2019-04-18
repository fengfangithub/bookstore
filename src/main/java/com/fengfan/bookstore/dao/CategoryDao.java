package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.CategoryEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CategoryDao
 * @Author fengfan
 * @Date 2019/4/16 12:25
 * @Description TODO
 * @Version 1.0
 **/
public interface CategoryDao {
    /**
     * @return
     * @Author fengfan
     * @Date 2019/4/14 14:02
     * @Paran
     * @Description 查询书籍分类
     * @Exception
     **/
    List<CategoryEntity> selectClassifyList() throws Exception;

}
