package Scoket;

public class MainServer {

    public static void main(String[] args) {
        //这里服务器只需要定义一个端口号就可以了，程序会自动获取IP地址
        //但是客户端需要连接这个服务器时，需要知道它的IP地址还有端口号
        //ip地址的查看方法：进入cmd窗口，输入ipconfig/all可以看到
        Server server=new Server(6768);
        server.start();
    }
}
