package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-10
 * @LastEditors: mianmiantea2019
 * @Description:
 */
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class ImoocBilibiliApp {

    public static void main(String[] args){
        ApplicationContext app = SpringApplication.run(ImoocBilibiliApp.class, args);
    }
}
