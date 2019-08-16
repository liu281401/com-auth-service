package com.auth.service.entity;

import lombok.Data;

/**
 * @Classname: Role
 * @Description: TODO
 * @Date: 2019-06-25 15:06
 * @Author: Yu.Liu
 **/
@Data
public class Result {
    private int code;
    private String message;
    private Object data;
}
