package com.fengfan.bookstore.vo;


import com.fengfan.bookstore.entity.IndexBookEntity;

import java.util.List;

/**
 * @ClassName IndexBookVo
 * @Author fengfan
 * @Date 2019/5/1 17:59
 * @Description TODO
 * @Version 1.0
 **/
public class IndexBookVo {
    private List<List<IndexBookEntity>> classBook;

    public List<List<IndexBookEntity>> getClassBook() {
        return classBook;
    }

    public void setClassBook(List<List<IndexBookEntity>> classBook) {
        this.classBook = classBook;
    }
}
