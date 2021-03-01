package list.set;

public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        if (this.score > o.score) {
            return -1;
        } else if(this.score<o.score){
            return 1;
        } else {
            if (this.age > o.age) {
                return -1;
            } else if (this.age < o.age) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


}
