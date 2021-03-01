package neibulei;

import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher t;
    private ArrayList<Student> sList;

    public Course(String name, Teacher t, ArrayList<Student> sList) {
        this.name = name;
        this.t = t;
        this.sList = sList;
    }

    public Course() {

    }

    public void show(){
        System.out.println(name);
        System.out.println(t.getName());
        for (Student student : sList) {
            String name = student.getName();
            if (student.isCome()) {
                System.out.println("上课"+name);
            } else {
                System.out.println("缺课"+name);
            }
        }
    }
}
