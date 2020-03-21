package com.monster.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lipengfei
 * @title: CommonResult
 * @projectName cloud
 * @description: 前端交互通用配置类
 * @date 2020/03/15 16:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;
    /**
    　　* @description: 无数据构造方法
    　　* @param [code, message]
    　　* @return {@link }
    　　* @throws
    　　* @author lipengfei
    　　* @date 2020/03/15 16:49
    　　*/
    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
