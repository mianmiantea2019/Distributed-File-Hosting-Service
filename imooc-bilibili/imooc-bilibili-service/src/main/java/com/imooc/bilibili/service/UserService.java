package com.imooc.bilibili.service;

import com.imooc.bilibili.dao.UserDao;
import com.imooc.bilibili.domain.User;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-10
 * @LastEditors: mianmiantea2019
 * @Description:
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void addUser(User user) {
        String phone = user.getPhone();
    }
}

