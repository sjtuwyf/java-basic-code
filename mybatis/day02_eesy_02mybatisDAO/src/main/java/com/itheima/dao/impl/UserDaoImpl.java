package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }


    public List<User> findAll() {

        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
        session.close();
        return users;
    }

    public void saveUser(User user) {

        SqlSession session = factory.openSession();
        session.insert("com.itheima.dao.IUserDao.saveUser",user);
        session.commit();
        session.close();

    }

    public void updateUser(User user) {

        SqlSession session = factory.openSession();
        session.update("com.itheima.dao.IUserDao.updateUser",user);
        session.commit();
        session.close();
    }

    public void deleteUser(Integer userId) {

        SqlSession session = factory.openSession();
        session.update("com.itheima.dao.IUserDao.deleteUser",userId);
        session.commit();
        session.close();
    }

    public User findById(Integer userId) {
        SqlSession session = factory.openSession();
        User user = session.selectOne("com.itheima.dao.IUserDao.findById",userId);
        session.close();
        return user;
    }

    public List<User> findByName(String username) {
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findByName",username);
        session.close();
        return users;
    }

    public int findTotal() {
        SqlSession session = factory.openSession();
        Integer count = session.selectOne("com.itheima.dao.IUserDao.findTotal");
        session.close();
        return count;
    }
}
