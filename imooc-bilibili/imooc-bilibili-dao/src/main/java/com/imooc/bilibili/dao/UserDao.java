package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.Set;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-10
 * @LastEditors: mianmiantea2019
 * @Description:
 */

@Mapper
public interface UserDao {
    User getUserByPhone(String phone);
    Integer addUser(User user);
    User getUserById(Long id);
}
