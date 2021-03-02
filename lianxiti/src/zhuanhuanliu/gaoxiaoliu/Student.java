package zhuanhuanliu.gaoxiaoliu;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 786076099688966L;
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {

    }

    public Student(String name, int age, String sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
