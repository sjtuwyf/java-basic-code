package neibulei;

import java.util.ArrayList;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dianMing(ArrayList<Student> slist){
        for (int i = 0; i < slist.size(); i++) {
            Student student = slist.get(i);

            if (!student.getName().equals("小明")){
                student.setCome(true);
            }
        }
    }
}
