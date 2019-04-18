package com.fengfan.bookstore.entity;

import java.util.List;

/**
 * @ClassName CategoryEntity
 * @Author fengfan
 * @Date 2019/4/14 13:59
 * @Description TODO
 * @Version 1.0
 **/
public class CategoryEntity {
    private int id;  //书籍分类ID
    private String name;  //书籍分类名字
    private int isDelete;  //是否删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
