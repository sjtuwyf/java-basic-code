package zhuanhuanliu.gaoxiaoliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test02_02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lianxiti/file/ss.txt"));
        Student student = (Student) ois.readObject();
        System.out.println(student);
    }
}
