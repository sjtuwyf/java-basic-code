package com.itheima.mybatis.sqlsession;

import com.itheima.dao.IUserDao;

public interface SqlSession {
    <T> T getMapper(Class<T> daoInterfaceClass);

    void close();
}
