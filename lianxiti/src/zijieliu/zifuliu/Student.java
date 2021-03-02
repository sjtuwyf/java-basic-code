package zijieliu.zifuliu;

public class Student {
    private int num;
    private int age;
    private String name;
    private String sex;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {

    }

    public Student(int num, int age, String name, String sex) {

        this.num = num;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
}
