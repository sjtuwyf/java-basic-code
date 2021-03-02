package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer02 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(6789);
        Socket accept = socket.accept();

        InputStream is = accept.getInputStream();

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lianxiti/file/st.jpg"));

        byte[] bytes = new byte[1024];
        int len=-1;
        while ((len = is.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        bos.close();
        is.close();
        accept.close();
        socket.close();
    }
}
