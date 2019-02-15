package Scoket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 服务器端继承Thread
 * 可以实现简单的交互
 */
public class Server extends Thread {

    // 定义服务器接口ServerSocket
    ServerSocket server = null;

    // 定义一个服务器，定义端口
    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 发送消息的线程
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("服务器在启动中...等待用户的连接");
            //一直接收用户的连接，连接之后发送一条短信给用户
            while(true){
                // 建立socket接口，accept方法是一个阻塞进程,等到有用户连接才往下走
                // 定义Socket类
                Socket  socket = server.accept();
                //通过socket对象可以获得输出流，用来写数据
                OutputStream os = socket.getOutputStream();
                // 向客户端发送消息
                os.write("服务器正在向你发送消息！".getBytes());
                //在服务器上显示连接的上的电脑、
                System.out.println(socket.getInetAddress().getHostAddress()+"连接上了！");
                //通过socket对象可以获得输入流，用来读取用户数据
                InputStream is=socket.getInputStream();
                //读取数据
                int len=0;
                byte[] buf=new byte[1024];
                while ((len=is.read(buf))!=-1) {
                    //直接把获得的数据打印出来
                    System.out.println("服务器接收到客户端的数据："+new String(buf,0,len));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}