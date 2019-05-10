package com.fengfan.bookstore.service.impl;

import com.fengfan.bookstore.dao.BookDao;
import com.fengfan.bookstore.dao.BookShelvesDao;
import com.fengfan.bookstore.dao.CategoryDao;
import com.fengfan.bookstore.dao.CollectionDao;
import com.fengfan.bookstore.entity.*;
import com.fengfan.bookstore.service.BookShelvesService;
import com.fengfan.bookstore.service.CommentService;
import com.fengfan.bookstore.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private CommentService commentService;

    @Autowired
    private CollectionDao collectionDao;

    @Override
    public List<CategoryEntity> queryCategory() throws Exception {
        return categoryDao.selectClassifyList();
    }

    @Override
    public IndexBookVo queryBookShelvesList() throws Exception {
        List<CategoryEntity> categoryEntityList = categoryDao.selectClassifyList();
        List<List<IndexBookEntity>> classBook = new ArrayList<>();
        for(CategoryEntity categoryEntity : categoryEntityList){
            List<IndexBookEntity> bookList = bookShelvesDao.selectClassBook(categoryEntity.getId());
            classBook.add(bookList);
        }
        IndexBookVo indexBookVo = new IndexBookVo();
        indexBookVo.setClassBook(classBook);
        return indexBookVo;
    }

    @Override
    public List<BookShelvesListVo> queryFuzzyBookShelvesList(String keyword) throws Exception {
        List<BookShelvesListVo> listVo = new ArrayList<>();
        List<BookShelvesEntity> listEntity = bookShelvesDao.selectFuzzyBookShelvesList(keyword);
        for (BookShelvesEntity bookShelvesEntity : listEntity) {
            BookShelvesListVo bookShelvesListVo = new BookShelvesListVo();
            bookShelvesListVo.setId(bookShelvesEntity.getId());
            bookShelvesListVo.setDescribe(bookShelvesEntity.getDescribe());
            bookShelvesListVo.setPrice(bookShelvesEntity.getPrice());
            bookShelvesListVo.setSales(bookShelvesEntity.getSales());
            List<ShowImgEntity> listImg = bookShelvesDao.selectShowImg(bookShelvesEntity.getId());
            bookShelvesListVo.setUrl(listImg.get(0).getUrl());
            listVo.add(bookShelvesListVo);
        }
        return listVo;
    }

    @Override
    public BookShelvesVo queryBookShelves(int bookShelvesID,int userID) throws Exception {
        BookShelvesEntity bookShelvesEntity = bookShelvesDao.selectBookShelvesInfo(bookShelvesID);
        List<ShowImgEntity> showImgEntityList = bookShelvesDao.selectShowImg(bookShelvesID);
        List<DetailedEntity> detailedEntityList = bookShelvesDao.selectDetailed(bookShelvesID);
        BookEntity bookEntity = bookDao.selectBookInfo(bookShelvesEntity.getBookID());
        List<CommentVo> allComment = commentService.queryComment(bookShelvesID);
        List<CommentVo> highComment = commentService.queryHighReview(bookShelvesID);
        List<CommentVo> mediumComment = commentService.queryMediumReview(bookShelvesID);
        List<CommentVo> badComment = commentService.queryBadReview(bookShelvesID);
        CollectionEntity collectionEntity = collectionDao.selectByBookID(userID,bookShelvesID);
        BookShelvesVo bookShelvesVo = new BookShelvesVo();
        bookShelvesVo.setBookEntity(bookEntity);
        bookShelvesVo.setBookShelvesEntity(bookShelvesEntity);
        bookShelvesVo.setShowImgEntityList(showImgEntityList);
        bookShelvesVo.setDetailedEntityList(detailedEntityList);
        bookShelvesVo.setAllComment(allComment);
        bookShelvesVo.setHighComment(highComment);
        bookShelvesVo.setMediumComment(mediumComment);
        bookShelvesVo.setBadComment(badComment);
        bookShelvesVo.setCollectionEntity(collectionEntity);
        return bookShelvesVo;
    }

    @Override
    public IndexBookVo queryIndexBook() throws Exception {
        List<CategoryEntity> categoryEntityList = categoryDao.selectClassifyList();
        List<List<IndexBookEntity>> classBook = new ArrayList<>();
        for(CategoryEntity categoryEntity : categoryEntityList){
            List<IndexBookEntity> bookList = bookShelvesDao.selectIndexBook(categoryEntity.getId());
            classBook.add(bookList);
        }
        IndexBookVo indexBookVo = new IndexBookVo();
        indexBookVo.setClassBook(classBook);
        return indexBookVo;
    }

    @Override
    public BookShelvesClassVo queryClassBook(int categoryID) throws Exception {
        List<IndexBookEntity> defaultBook = bookShelvesDao.selectBookShelvesByDefault(categoryID);
        List<IndexBookEntity> timeBook = bookShelvesDao.selectBookShelvesByTime(categoryID);
        List<IndexBookEntity> priceBook = bookShelvesDao.selectBookShelvesByPrice(categoryID);
        List<IndexBookEntity> salesBook = bookShelvesDao.selectBookShelvesBySales(categoryID);
        BookShelvesClassVo bookShelvesClassVo = new BookShelvesClassVo();
        bookShelvesClassVo.setBookDefault(defaultBook);
        bookShelvesClassVo.setBookTime(timeBook);
        bookShelvesClassVo.setBookPrice(priceBook);
        bookShelvesClassVo.setBookSales(salesBook);
        return bookShelvesClassVo;
    }
}
