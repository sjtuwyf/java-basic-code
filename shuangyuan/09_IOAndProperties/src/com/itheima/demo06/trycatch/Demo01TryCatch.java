package com.itheima.demo06.trycatch;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {

    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("w:shuangyuan\\09_IOAndProperties\\gg.txt",true);

            for (int i = 0; i < 10; i++) {
                fw.write("abcdfsf"+i+"\r\n");
            }


        } catch (IOException e){
            System.out.println(e);

        } finally {

            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }
}
