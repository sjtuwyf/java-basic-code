package socket;

import java.io.*;
import java.net.Socket;

public class TCPClient02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",6789);

        OutputStream os = socket.getOutputStream();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lianxiti/file/a.jpg"));

        int len = 0;
//        char[] chars = new char[1024];

        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {

            os.write(bytes,0,len);
        }

        bis.close();
        os.close();
        socket.close();
    }
}
