package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

public class ReflectDemo1 {


    /**
     * 获取Class对象的方式：
     * 1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
     * 2. 类名.class：通过类名的属性class获取
     * 3. 对象.getClass()：getClass()方法在Object类中定义着。
     */

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        Person person = new Person();
        Class<? extends Person> cls3 = person.getClass();
        System.out.println(cls3);


        System.out.println(cls1 == cls2);
        System.out.println(cls3 == cls2);
        System.out.println(cls1 == cls3);


        Class<Student> c = Student.class;
        System.out.println(c == cls1);
    }

}
