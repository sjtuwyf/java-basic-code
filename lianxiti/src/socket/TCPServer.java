package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        int len;
        byte[] bytes = new byte[1024];

        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));

        }
        is.close();
        ss.close();
    }
}
