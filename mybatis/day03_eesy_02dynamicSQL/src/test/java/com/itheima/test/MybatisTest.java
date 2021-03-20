package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MybatisTest {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;


    /**
     * 初始化
     * @throws Exception
     */
    @Before
    public void init() throws Exception  {

        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

//        sqlSession = factory.openSession(true);
        sqlSession = factory.openSession();

        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After
    public void destroy() throws Exception {
        sqlSession.commit();
        sqlSession.close();
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
    public void testFindByVo() throws Exception {

        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);

        List<User> users = userDao.findUserByVo(vo);
        for (User u:users) {
            System.out.println(u);
        }

    }

    @Test
    public void testFindByCondition() throws Exception {
        User u = new User();
        u.setUsername("老王");
//        u.setUserSex("女");

        List<User> users = userDao.findUserByCondition(u);

        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    public void testFindInIds() throws Exception {
        QueryVo vo = new QueryVo();
        List<Integer> list = new ArrayList<Integer>();
        list.add(41);
        list.add(42);
        list.add(46);
        vo.setIds(list);

        List<User> users = userDao.findUserInIds(vo);

        for (User user : users) {
            System.out.println(user);
        }

    }
}
