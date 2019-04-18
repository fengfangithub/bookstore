package com.fengfan.bookstore.entity;

/**
 * @ClassName BookEntity
 * @Author fengfan
 * @Date 2019/4/6 12:43
 * @Description 图书基本信息
 * @Version 1.0
 **/
public class BookEntity {
    private int id;  //图书id
    private String name;  //图书名
    private String author;  //图书作者
    private String press;  //图书出版社
    private String publicationDate; //出版时间
    private int categoryID;  //图书类型id
    private String ISBN;  //图书编号
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
