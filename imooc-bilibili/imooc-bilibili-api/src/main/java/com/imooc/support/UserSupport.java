package com.imooc.support;

import com.imooc.bilibili.domain.exception.ConditionException;
import com.imooc.bilibili.service.UserService;
import com.imooc.bilibili.service.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-10
 * @LastEditors: mianmiantea2019
 * @Description:
 */

@Component
public class UserSupport {
    private final UserService userService;

    @Autowired
    public UserSupport(UserService userService) {
        this.userService = userService;
    }

    public Long getCurrentUserId() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String token = request.getHeader("token");
        Long userId = TokenUtil.verifyToken(token);
        if(userId < 0) {
            throw new ConditionException("unauthorized");
        }
        return userId;
    }

    //renew token
    private void verifyRefreshToken(Long userId){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        String refreshToken = requestAttributes.getRequest().getHeader("refreshToken");
        String dbRefreshToken = userService.getRefreshTokenByUserId(userId);
        if(!dbRefreshToken.equals(refreshToken)){
            throw new ConditionException("unauthorized！");
        }
    }
}
