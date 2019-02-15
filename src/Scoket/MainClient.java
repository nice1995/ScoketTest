package Scoket;

public class MainClient {

    public static void main(String[] args) {
        //需要服务器的正确的IP地址和端口号
        Client client2=new Client("172.28.6.80", 6768);
        client2.start();
    }

    //程序中要先开启服务端，在开启客户端，否则会报错！
    //还有就是一般的电脑是动态的IP地址，每天都在变化。要注意修改！

//    TCP(传输控制协议)方式
//    UDP(用户数据报协议)方式
}
