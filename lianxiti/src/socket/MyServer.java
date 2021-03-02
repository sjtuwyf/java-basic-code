package socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        while (true) {
            Socket socket = ss.accept();
            new Thread(){
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();

                        FileOutputStream fos = new FileOutputStream("lianxiti/file/"+System.currentTimeMillis() + ".jpg");
                        int len =0;
                        byte[] bytes = new byte[1024];


                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes,0,len);
                        }
                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());
                        os.close();
                        fos.close();
                        is.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
