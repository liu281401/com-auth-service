package com.auth.service.dao;

import com.auth.service.entity.Role;

import java.util.List;

public interface RoleDao {
    /**
     * 根据用户id查找角色列表
     * @param memberId 用户id
     * @return 角色列表
     */
    List<Role> findByMemberId(Integer memberId);
}
