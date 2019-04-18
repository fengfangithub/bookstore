package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.BookDao;
import com.fengfan.bookstore.dao.BookShelvesDao;
import com.fengfan.bookstore.dao.CategoryDao;
import com.fengfan.bookstore.entity.*;
import com.fengfan.bookstore.service.BookShelvesService;
import com.fengfan.bookstore.vo.BookShelvesVo;
import com.fengfan.bookstore.vo.BookShelvesVoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookShelvesImpl
 * @Author fengfan
 * @Date 2019/4/18 16:15
 * @Description TODO
 * @Version 1.0
 **/

@Service
public class BookShelvesImpl implements BookShelvesService {

    @Autowired
    private BookShelvesDao bookShelvesDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private BookDao bookDao;

    @Override
    public List<CategoryEntity> queryCategory() throws Exception {
        return categoryDao.selectClassifyList();
    }

    @Override
    public List<BookShelvesVoList> queryBookShelvesList(int categoryID, int page) throws Exception {
        List<BookShelvesVoList> listVo = new ArrayList<>();
        List<BookShelvesEntity> listEntity = bookShelvesDao.selectBookShelvesList(1, 0, 10);
        for (BookShelvesEntity bookShelvesEntity : listEntity) {
            BookShelvesVoList bookShelvesVoList = new BookShelvesVoList();
            bookShelvesVoList.setId(bookShelvesEntity.getId());
            bookShelvesVoList.setDescribe(bookShelvesEntity.getDescribe());
            bookShelvesVoList.setPrice(bookShelvesEntity.getPrice());
            bookShelvesVoList.setSales(bookShelvesEntity.getSales());
            List<ShowImgEntity> listImg = bookShelvesDao.selectShowImg(bookShelvesEntity.getId());
            bookShelvesVoList.setShowImg(listImg.get(0).getUrl());
            listVo.add(bookShelvesVoList);
        }
        return listVo;
    }

    @Override
    public List<BookShelvesVoList> queryFuzzyBookShelvesList(String keyword, int page) throws Exception {
        List<BookShelvesVoList> listVo = new ArrayList<>();
        List<BookShelvesEntity> listEntity = bookShelvesDao.selectFuzzyBookShelvesList(keyword,(page-1)*10,10);
        for (BookShelvesEntity bookShelvesEntity : listEntity) {
            BookShelvesVoList bookShelvesVoList = new BookShelvesVoList();
            bookShelvesVoList.setId(bookShelvesEntity.getId());
            bookShelvesVoList.setDescribe(bookShelvesEntity.getDescribe());
            bookShelvesVoList.setPrice(bookShelvesEntity.getPrice());
            bookShelvesVoList.setSales(bookShelvesEntity.getSales());
            List<ShowImgEntity> listImg = bookShelvesDao.selectShowImg(bookShelvesEntity.getId());
            bookShelvesVoList.setShowImg(listImg.get(0).getUrl());
            listVo.add(bookShelvesVoList);
        }
        return listVo;
    }

    @Override
    public BookShelvesVo queryBookShelves(int bookShelvesID) throws Exception {

        BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(bookShelvesID);
        List<ShowImgEntity> showImgEntityList = bookShelvesDao.selectShowImg(bookShelvesID);
        List<DetailedEntity> detailedEntityList = bookShelvesDao.selectDetailed(bookShelvesID);
        BookEntity bookEntity = bookDao.selectBookInfo(bookShelvesEntity.getBookID());
        BookShelvesVo bookShelvesVo = new BookShelvesVo();
        bookShelvesVo.setId(bookShelvesEntity.getId());
        bookShelvesVo.setBookEntity(bookEntity);
        bookShelvesVo.setShowImgEntityList(showImgEntityList);
        bookShelvesVo.setDetailedEntityList(detailedEntityList);
        bookShelvesVo.setDescribe(bookShelvesEntity.getDescribe());
        bookShelvesVo.setOriginalPrice(bookShelvesEntity.getOriginalPrice());
        bookShelvesVo.setPoints(bookShelvesEntity.getPoints());
        bookShelvesVo.setPrice(bookShelvesEntity.getPrice());
        bookShelvesVo.setSales(bookShelvesEntity.getSales());
        if (bookShelvesEntity.getIsExpressFee() == 1) {
            bookShelvesVo.setIsExpressFee("包邮");
            bookShelvesVo.setPostage(new BigDecimal(0));
        }
        if (bookShelvesEntity.getIsReal() == 1) {
            bookShelvesVo.setIsReal("正品保证");
        }
        if (bookShelvesEntity.getIsReturn() == 1) {
            bookShelvesVo.setIsReturn("急速退款");
        }
        if (bookShelvesEntity.getIsRefund() == 1) {
            bookShelvesVo.setIsRefund("七天无理由退换");
        }

        return bookShelvesVo;
    }
}
