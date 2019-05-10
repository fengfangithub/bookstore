package com.fengfan.bookstore.service;

import com.fengfan.bookstore.entity.CollectionEntity;
import com.fengfan.bookstore.vo.CollectionVo;

import java.util.List;

/**
 * @ClassName CollectionService
 * @Author fengfan
 * @Date 2019/4/23 14:21
 * @Description TODO
 * @Version 1.0
 **/

public interface CollectionService {
    int insertCollection(CollectionEntity collectionEntity) throws Exception;

    List<CollectionVo> queryCollection(int userID) throws Exception;

    int deleteCollection(int id) throws Exception;
}
