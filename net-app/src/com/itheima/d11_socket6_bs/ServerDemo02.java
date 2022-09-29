package com.itheima.d11_socket6_bs;

import java.io.*;
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
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                new ServerReaderThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
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
            // 浏览器 已经与本线程建立了Socket管道
            // 响应消息给浏览器显示
            PrintStream ps = new PrintStream(socket.getOutputStream());
            // 必须响应HTTP协议格式数据，否则浏览器不认识消息
            ps.println("HTTP/1.1 200 OK"); // 协议类型和版本 响应成功的消息！
            ps.println("Content-Typr:text/html;charset=UTF-8"); // 响应的数据类型：文本/网页
            ps.println();  // 必须发送一个空行
            // 才可以响应数据回去给浏览器
            ps.println("hello world");
            ps.close();
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
        }
    }
}