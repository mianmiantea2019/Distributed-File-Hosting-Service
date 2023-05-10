package com.imooc.bilibili.domain;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-10
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class User {

    private Long id;

    private String phone;

    private String email;

    private String password;

    private String salt;

    private Date createTime;

    private Date updateTime;

    private UserInfo userInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
