package com.imooc.bilibili.domain.exception;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-10
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class ConditionException extends RuntimeException{

    private static final long serialVersionUID = 1L; // ensure that the serialized object can be properly deserialized

    private String code;

    public ConditionException(String code, String name){
        super(name);
        this.code = code;
    }

    public ConditionException(String name){
        super(name);
        code = "500";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
