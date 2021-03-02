package zhuanhuanliu.gaoxiaoliu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test02_01 {
    public static void main(String[] args) throws IOException {
        Student student = new Student("jack", 20, "man");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lianxiti/file/ss.txt"));

        oos.writeObject(student);

        oos.close();
    }
}
