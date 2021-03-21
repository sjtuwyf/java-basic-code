package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @Author ssqswyf
 * @Date 2021/3/19
 */
public interface IAccountDao {


    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAll();

    List<Account> findAccountByUid(Integer uid);


}
