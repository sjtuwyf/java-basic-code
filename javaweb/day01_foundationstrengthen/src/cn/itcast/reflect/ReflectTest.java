package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
//        Person person = new Person();
//        person.eat();

//        Student student = new Student();
//        student.sleep();


        Properties pro = new Properties();

        ClassLoader classLoader = ReflectTest.class.getClassLoader();

        InputStream is = classLoader.getResourceAsStream("pro.properties");

        pro.load(is);


        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");


        Class<?> cls = Class.forName(className);
        Object obj = cls.newInstance();

        Method method = cls.getMethod(methodName);

        method.invoke(obj);


    }
}
