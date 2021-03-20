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
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//
//        SqlSession sqlSession = factory.openSession();
//
//        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        List<User> users = userDao.findAll();

        for (User user : users) {
            System.out.println(user);
        }

//        sqlSession.close();
//        in.close();
    }

    @Test
    public void testSaveUser() throws Exception {

        User user = new User();
        user.setUsername("mybatis last insertid saveUser");
        user.setUserAddress("北京市海淀区");
        user.setUserSex("男");
        user.setUserBirthday(new Date());

        System.out.println("保存操作之前:"+user);
        userDao.saveUser(user);
        System.out.println("保存操作之后:"+user);

    }

    @Test
    public void testUpdateUser() throws Exception {

        User user = new User();
        user.setUserId(49);
        user.setUsername("mybatis updateUser");
        user.setUserAddress("上海市黄埔区");
        user.setUserSex("男");
        user.setUserBirthday(new Date());

        userDao.updateUser(user);

    }

    @Test
    public void testDeleteUser() throws Exception {

        userDao.deleteUser(48);

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

    @Test
    public void testFindByVo() throws Exception {

        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);

        List<User> users = userDao.findUserByVo(vo);
//        List<User> users = userDao.findByName("王");
        for (User u:users) {
            System.out.println(u);
        }

    }
}
