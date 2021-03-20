package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;


import java.util.Date;
import java.util.List;


public class MybatisTest {

    private InputStream in;

    private IUserDao userDao;


    /**
     * 初始化
     * @throws Exception
     */
    @Before
    public void init() throws Exception  {

        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);



        userDao = new UserDaoImpl(factory);
    }

    @After
    public void destroy() throws Exception {

        in.close();
    }


    @Test
    public void testFindAll() throws Exception {

        List<User> users = userDao.findAll();

        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    public void testSaveUser() throws Exception {

        User user = new User();
        user.setUsername("dao impl user");
        user.setAddress("北京市海淀区");
        user.setSex("男");
        user.setBirthday(new Date());

        System.out.println("保存操作之前:"+user);
        userDao.saveUser(user);
        System.out.println("保存操作之后:"+user);

    }

    @Test
    public void testUpdateUser() throws Exception {

        User user = new User();
        user.setId(49);
        user.setUsername("impl mybatis updateUser");
        user.setAddress("上海市黄埔区");
        user.setSex("男");
        user.setBirthday(new Date());

        userDao.updateUser(user);

    }

    @Test
    public void testDeleteUser() throws Exception {

        userDao.deleteUser(54);

    }

    @Test
    public void testFindOne() throws Exception {

        User user = userDao.findById(49);
        System.out.println(user);

    }

    @Test
    public void testFindByName() throws Exception {

        List<User> users = userDao.findByName("%王%");
//        List<User> users = userDao.findByName("王");
        for (User user:users) {
            System.out.println(user);
        }

    }

    @Test
    public void testFindTotal() throws Exception {

        int count = userDao.findTotal();
        System.out.println(count);

    }



}
