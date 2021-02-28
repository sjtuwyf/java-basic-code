package cn.day06.itcast.demo05;

public class Demo01Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println(stu1.getName() + stu1.getAge());

        Student stu2 = new Student("古力娜扎", 21);


        System.out.println(stu2.getName() + stu2.getAge());
        stu2.setAge(22);
        System.out.println(stu2.getName() + stu2.getAge());
    }
}
