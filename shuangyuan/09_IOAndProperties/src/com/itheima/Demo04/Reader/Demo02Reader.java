package com.itheima.Demo04.Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {

    public static void main(String[] args) throws IOException {
        File file;
        FileReader fr = new FileReader("shuangyuan\\09_IOAndProperties\\c.txt");

//        int len=0;
//
//        while ((len = fr.read())!=-1){
//            System.out.print((char) len);
//        }

        char[] chars = new char[1024];
        int len =0;
        while ((len = fr.read(chars))!=-1){
            System.out.println(new String(chars ,0,len));
        }

        fr.close();
    }
}
