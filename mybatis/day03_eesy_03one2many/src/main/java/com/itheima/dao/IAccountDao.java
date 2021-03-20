package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;

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

    /**
     *
     * @return
     */
    List<AccountUser> findAllAccount();
}
