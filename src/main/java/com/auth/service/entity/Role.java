package com.auth.service.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @Classname: Role
 * @Description: TODO
 * @Date: 2019-06-25 15:06
 * @Author: Yu.Liu
 **/
@Data
public class Role {
    private int id;
    private String roleName;
    private short valid;
    private Date createTime;
    private Date updateTime;
    private Set<Permission> permissions;
}
