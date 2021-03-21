package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author ssqswyf
 * @Date 2021/3/19
 */
public class UserTest {

    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws Exception  {

        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        factory = new SqlSessionFactoryBuilder().build(in);

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
    public void testFirstCache(){

        User user1 = userDao.findById(41);
        System.out.println(user1);

//        sqlSession.close();
//        sqlSession = factory.openSession();
        sqlSession.clearCache();
        userDao = sqlSession.getMapper(IUserDao.class);

        User user2 = userDao.findById(41);
        System.out.println(user2);

        System.out.println(user1==user2);
    }

    @Test
    public void testClearCache(){

        User user1 = userDao.findById(41);
        System.out.println(user1);

        user1.setUsername("update user clear cache");
        user1.setAddress("beijing");
        userDao.updateUser(user1);

        User user2 = userDao.findById(41);
        System.out.println(user2);

        System.out.println(user1==user2);
    }



    @Test
    public void testFindAll(){

        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("---------------");
            System.out.println(user);


        }
    }





}
