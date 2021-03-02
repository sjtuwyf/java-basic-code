package zijieliu.zifuliu;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Test02_06 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("lianxiti/file/score.txt"));

        Set<String> strings = properties.stringPropertyNames();

        for (String string : strings) {
            if (string.equals("lisi")) {
                properties.setProperty(string,"100");
            }
        }

        properties.store(new FileOutputStream("lianxiti/file/score.txt"),"haha");



    }
}
