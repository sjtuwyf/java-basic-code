package cn.day06.itcast.demo04;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造方法执行了！");

    }

    public Student(String name, int age) {
        System.out.println("有参构造方法执行了！");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        this.age = num;
    }

    public int getAge() {
        return age;
    }

}
