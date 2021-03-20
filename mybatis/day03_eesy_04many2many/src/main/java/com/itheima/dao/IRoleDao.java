package com.itheima.dao;

import com.itheima.domain.Role;

import java.util.List;

/**
 * @Author ssqswyf
 * @Date 2021/3/20
 */
public interface IRoleDao {
    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
