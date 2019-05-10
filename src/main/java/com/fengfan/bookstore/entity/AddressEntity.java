package com.fengfan.bookstore.entity;

/**
 * @ClassName AddressEntity
 * @Author fengfan
 * @Date 2019/4/6 13:46
 * @Description 用户收货地址实体类
 * @Version 1.0
 **/
public class AddressEntity {
    private int id;  //地址id
    private String name;  //收货人名字
    private int sex;  //收货人性别
    private String phone;  //电话号码
    private String province;  //收货人省份
    private String city;  //收货人市区
    private String county;  //收货人县区
    private String detailedAddress;  //收货人详细地址
    private int isDefault;  //收货人默认地址
    private int userID;  //收货人id
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
