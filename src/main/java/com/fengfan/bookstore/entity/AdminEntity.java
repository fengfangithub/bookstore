package com.fengfan.bookstore.entity;

/**
 * @ClassName AdminEntity
 * @Author fengfan
 * @Date 2019/5/9 12:00
 * @Description TODO
 * @Version 1.0
 **/
public class AdminEntity {
    private String name;
    private String password;
    private String createTime;
    private int isDelete;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
