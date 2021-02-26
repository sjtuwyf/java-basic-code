package com.itheima.Demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("shuangyuan\\09_IOAndProperties\\g.txt",true);

        for (int i = 0; i < 10; i++) {
            fw.write("abcdfsf"+i+"\r\n");
        }

        char[] cs ={'1','a','d','e'};

        fw.write(cs);
        fw.write(cs,1,3);
        fw.write("wfeafwefawfw");
        fw.write("abcdefg",3,3);

        fw.close();

    }
}
