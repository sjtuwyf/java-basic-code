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
public class SecondLevelCacheTest {

    private InputStream in;
    private SqlSessionFactory factory;


    @Before
    public void init() throws Exception  {

        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        factory = new SqlSessionFactoryBuilder().build(in);


    }

    @After
    public void destroy() throws Exception {

        in.close();
    }

    @Test
    public void testFirstCache(){

        SqlSession sqlSession1 = factory.openSession();
        IUserDao dao1 = sqlSession1.getMapper(IUserDao.class);

        User user1 = dao1.findById(41);
        System.out.println(user1);
        sqlSession1.close();

        SqlSession sqlSession2 = factory.openSession();
        IUserDao dao2 = sqlSession2.getMapper(IUserDao.class);

        User user2 = dao2.findById(41);
        System.out.println(user2);
        sqlSession2.close();


        System.out.println(user1==user2);
    }







}
