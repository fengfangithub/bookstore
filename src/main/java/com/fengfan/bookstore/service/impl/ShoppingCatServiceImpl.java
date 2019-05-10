package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.BookShelvesDao;
import com.fengfan.bookstore.dao.ShoppingCatDao;
import com.fengfan.bookstore.entity.ShoppingCatEntity;
import com.fengfan.bookstore.service.ShoppingCatService;
import com.fengfan.bookstore.vo.ShoppingCatVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ShoppingCatServiceImpl
 * @Author fengfan
 * @Date 2019/4/23 15:10
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class ShoppingCatServiceImpl implements ShoppingCatService {

    @Autowired
    private ShoppingCatDao shoppingCatDao;

    @Autowired
    private BookShelvesDao bookShelvesDao;

    @Override
    public int insertShoppingCat(ShoppingCatEntity shoppingCatEntity) throws Exception {
        return shoppingCatDao.insertShoppingCat(shoppingCatEntity);
    }

    @Override
    public List<ShoppingCatVo> queryShoppingCat(int userID) throws Exception {
        List<ShoppingCatEntity> shoppingCatEntities = shoppingCatDao.selectShoppingCat(userID);
        List<ShoppingCatVo> shoppingCatVos = new ArrayList<>();
        for (ShoppingCatEntity shoppingCatEntity : shoppingCatEntities) {
            ShoppingCatVo shoppingCatVo = new ShoppingCatVo();
            shoppingCatVo.setShoppingCatEntity(shoppingCatEntity);
            shoppingCatVo.setBookShelvesEntity(bookShelvesDao.selectBookShelvesInfo(shoppingCatEntity.getBookShelvesID()));
            shoppingCatVo.setShowImgEntity(bookShelvesDao.selectShowImg(shoppingCatEntity.getBookShelvesID()).get(0));
            shoppingCatVos.add(shoppingCatVo);
        }
        return shoppingCatVos;
    }

    @Override
    public int deleteShoppingCat(int id) throws Exception {
        return shoppingCatDao.deleteShoppingCat(id);
    }
}
