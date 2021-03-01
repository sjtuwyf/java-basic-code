package collection;

public class Student {
    private String name;
    private int age;
    private String n;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", n='" + n + '\'' +
                '}';
    }

    public Student() {

    }

    public Student(String name, int age, String n) {

        this.name = name;
        this.age = age;
        this.n = n;
    }
}
