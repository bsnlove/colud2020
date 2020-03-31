package com.trall.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by 陈兵 on 2020/3/29.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {  //泛型：如果装的payment 返回payment,装的order 返回order

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
