package cn.itcast.annotation;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
@Pro(className = "cn.itcast.annotation.Demo1",methodName = "show")
public class ReflectTest {

    public static void main(String[] args) throws Exception {


        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        Pro an = reflectTestClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();

        Class<?> cls = Class.forName(className);
        Object obj = cls.newInstance();

        Method method = cls.getMethod(methodName);

        method.invoke(obj);



    }
}
