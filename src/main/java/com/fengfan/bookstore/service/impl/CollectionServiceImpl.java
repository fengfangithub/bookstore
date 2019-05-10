package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.BookShelvesDao;
import com.fengfan.bookstore.dao.CollectionDao;
import com.fengfan.bookstore.entity.CollectionEntity;
import com.fengfan.bookstore.entity.ShowImgEntity;
import com.fengfan.bookstore.service.CollectionService;
import com.fengfan.bookstore.vo.CollectionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CollectionServiceImpl
 * @Author fengfan
 * @Date 2019/4/23 14:23
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    private CollectionDao collectionDao;

    @Autowired
    private BookShelvesDao bookShelvesDao;

    @Override
    public int insertCollection(CollectionEntity collectionEntity) throws Exception {
        return collectionDao.insertCollection(collectionEntity);
    }

    @Override
    public List<CollectionVo> queryCollection(int userID) throws Exception {
        List<CollectionEntity> collectionEntities = collectionDao.selectCollection(userID);
        List<CollectionVo> collectionVos = new ArrayList<>();
        for (CollectionEntity collectionEntity : collectionEntities) {
            List<ShowImgEntity> showImgEntities = bookShelvesDao.selectShowImg(collectionEntity.getBookShelvesID());
            CollectionVo collectionVo = new CollectionVo();
            collectionVo.setId(collectionEntity.getId());
            collectionVo.setBookShelvesEntity(bookShelvesDao.selectBookShelvesInfo(collectionEntity.getBookShelvesID()));
            collectionVo.setUrl(showImgEntities.get(0).getUrl());
            collectionVos.add(collectionVo);
        }
        return collectionVos;
    }

    @Override
    public int deleteCollection(int id) throws Exception {
        return collectionDao.deleteCollection(id);
    }
}
