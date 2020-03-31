package com.trall.springCloud.entities;

import lombok.Data;

/**
 * Created by 陈兵 on 2020/3/29.
 */
public enum Status {
    Success(200,"成功"),
    fail(400,"失败");

    private Integer code;

    private String message;

    Status(Integer code, String message) {
        this.code = code;
        this.message =message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
