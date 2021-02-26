package jichengAndChouxianglei;

public class Test4 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("abc", 30, "java");

        teacher.teachF();

        Student student = new Student("cba", 18, 100);
        student.showScore();
    }
}
