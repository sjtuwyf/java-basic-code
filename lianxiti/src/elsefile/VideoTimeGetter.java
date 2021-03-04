package elsefile;

import java.beans.Encoder;


import java.io.File;
import java.util.ArrayList;

public class VideoTimeGetter {

    public static void main(String[] args) {
        File file = new File("D:\\File\\华生给文件\\19全栈\\03  Javaee");


        Encoder encoder = new Encoder();

        ArrayList<File> files = filesGetter(file);

        for (int i = 0; i < files.size(); i++) {
            String name = files.get(i).getName();

            System.out.println(i+"    "+name);
        }

    }

    public static ArrayList<File> filesGetter(File file){
        ArrayList<File> files = new ArrayList<>();
        if (file.isFile()) {
            files.add(file);

        }
        if (file.isDirectory()){
            File[] files1 = file.listFiles();
            for (File file1 : files1) {
                files.addAll(filesGetter(file1));
            }
        }
        return files;
    }
}
