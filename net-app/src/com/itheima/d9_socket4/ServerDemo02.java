package com.itheima.d9_socket4;

import com.itheima.d8_socket3.ServerReaderThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
    目标：开发Socket网络编程入门代码的服务端，实现接收消息。
 */
public class ServerDemo02 {
    public static void main(String[] args) {
        System.out.println("==========服务端启动成功===========");
        try {
            // 1. 注册端口
            ServerSocket serverSocket = new ServerSocket(7777);

            // a. 定义一个死循环由主线程负责不断的接收客户端的socket连接请求，
            while (true){
                // b. 每接到一个客户端socket管道，都要交给一个子线程负责读取。
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                // c. 开始创建独立线程处理socket管道。
                new ServerReaderThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}