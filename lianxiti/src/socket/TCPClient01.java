package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8002);

        InputStream is = socket.getInputStream();

        int len = 0;
        while ((len = is.read()) != -1) {
            System.out.print((char) len);
        }
        is.close();
        socket.close();


    }
}
