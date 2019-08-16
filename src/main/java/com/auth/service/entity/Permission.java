package com.auth.service.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Classname: Role
 * @Description: TODO
 * @Date: 2019-06-25 15:06
 * @Author: Yu.Liu
 **/
@Data
public class Permission {
    private int id;
    private String zuulPrefix;
    private String servicePrefix;
    private String method;
    private String uri;
    private Date createTime;
    private Date updateTime;
}
