package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer01 {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8002);
        Socket socket = ss.accept();

        OutputStream os = socket.getOutputStream();
        os.write("hello,world".getBytes());

        os.close();
        ss.close();
    }
}
