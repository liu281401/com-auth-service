package com.auth.service.dao;

import com.auth.service.entity.Permission;

import java.util.List;

/**
 * @Classname: PermissionDao
 * @Description: TODO
 * @Date: 2019-06-25 14:50
 * @Author: Yu.Liu
 **/
public interface PermissionDao {
    /**
     * 根据角色id查找权限列表
     * @param roleId 角色id
     * @return 权限列表
     */
    List<Permission> findByRoleId(Integer roleId);
}
