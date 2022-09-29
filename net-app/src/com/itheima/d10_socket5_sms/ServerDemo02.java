package com.itheima.d10_socket5_sms;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
    目标：开发Socket网络编程入门代码的服务端，实现接收消息。
 */
public class ServerDemo02 {
    // 定义一个静态的List集合存储当前全部在线的Socket管道
    public static List<Socket> allOnLineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        System.out.println("==========服务端启动成功===========");
        // 1. 注册端口
        ServerSocket serverSocket = new ServerSocket(7777);
        // a. 定义一个死循环由主线程负责不断的接收客户端的socket连接请求，
        while (true){
            // b. 每接到一个客户端socket管道，都要交给一个子线程负责读取。
            Socket socket = serverSocket.accept();
            allOnLineSockets.add(socket); // 上线了。
            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            // c. 开始创建独立线程处理socket管道。
            new ServerReaderThread(socket).start();
        }
    }
}


class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //  从socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            //  把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //  按照行读取
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + "说了：" + msg);
                // 把消息进行端口转发给全部客户端socket管道。
                sendMsgToAllClient(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            ServerDemo02.allOnLineSockets.remove(socket);
        }
    }

    private void sendMsgToAllClient(String msg) throws IOException {
        for (Socket socket : ServerDemo02.allOnLineSockets) {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}