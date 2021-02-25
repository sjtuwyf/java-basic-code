package miaoshuleijieshaoyushiyong;

public class Test6 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("周老师");
        teacher.setAge(30);
        teacher.setContent("java");
        teacher.eat();
        teacher.teach();

        Student student = new Student("韩同学", 18, "java");
        student.eat();
        student.study();


    }
}
