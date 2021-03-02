package socket;

import java.io.*;
import java.net.Socket;

public class MyClient02 {

    public static void main(String[] args) throws IOException {
        File file = new File("lianxiti/file/a.jpg");

        if (!file.exists()) {
            System.out.println("not exists");
            return;
        }
        if (!file.getName().endsWith(".jpg")) {
            System.out.println("not jpg");
            return;
        }
        if (file.length() >= 1024 * 1024 * 2) {
            System.out.println("too big");
            return;
        }




        FileInputStream fis = new FileInputStream(file);



        Socket socket = new Socket("127.0.0.1",9999);

        OutputStream os = socket.getOutputStream();

        BufferedInputStream bis = new BufferedInputStream(fis);

        int len = 0;
//        char[] chars = new char[1024];

        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {

            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        int i = is.read(bytes);
        System.out.println(new String(bytes,0,i));

        fis.close();

        bis.close();
        os.close();
        socket.close();
    }
}
