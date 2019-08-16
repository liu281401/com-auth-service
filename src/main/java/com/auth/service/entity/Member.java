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
public class Member {
    private int id;
    private String memberName;
    private String password;
    private String mobile;
    private String email;
    private short sex;
    private Date birthday;
    private Date createTime;
    private Set<Role> roles;
}
