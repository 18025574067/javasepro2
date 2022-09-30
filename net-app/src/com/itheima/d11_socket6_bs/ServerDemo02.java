package com.itheima.d11_socket6_bs;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
    目标：开发Socket网络编程入门代码的服务端，实现接收消息。
 */
public class ServerDemo02 {
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5,
            6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        System.out.println("==========服务端启动成功===========");
        try {
            // 1. 注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                pool.execute(new ServerReaderRunnable(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}