package com.fengfan.bookstore.dao;

import com.fengfan.bookstore.entity.CollectionEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CollectionDao
 * @Author fengfan
 * @Date 2019/4/23 14:01
 * @Description TODO
 * @Version 1.0
 **/

public interface CollectionDao {

    int insertCollection(CollectionEntity collectionEntity) throws Exception;

    List<CollectionEntity> selectCollection(@Param("userID") int userID) throws Exception;

    int deleteCollection(@Param("id") int id) throws Exception;

    CollectionEntity selectByBookID(@Param("userID") int userID,@Param("bookShelvesID") int bookShelvesID) throws Exception;

}
