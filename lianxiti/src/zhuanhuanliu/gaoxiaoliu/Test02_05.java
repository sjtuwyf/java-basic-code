package zhuanhuanliu.gaoxiaoliu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test02_05 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();


        students.add(new Student("a",1,"a"));
        students.add(new Student("b",1,"a"));
        students.add(new Student("c",1,"a"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lianxiti/file/abc.txt"));

        oos.writeObject(students);
        oos.close();
    }
}
