package com.itheima.d9_socket4_threadpool;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
    目标：多发多收。
 */
public class ClientDemo01 {
    public static void main(String[] args) {
        try {
            System.out.println("==========客户端启动成功===========");
            // 参数一：服务端的IP地址
            // 参数二：服务端的端口。
            Socket socket = new Socket("127.0.0.1", 7777);

            // 2. 从socket管道中得到一个字节输出流，负责发送数据。
            OutputStream os = socket.getOutputStream();

            // 3. 把低级的字节输出流包装成高级的打印流
            PrintStream ps = new PrintStream(os);

            // 4. 一直发送消息
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("请讲：");
                String msg = sc.nextLine();
                if ("exit".equals(msg)){
                    System.out.println("再见！");
                    ps.close();
                    break;
                }
                ps.println(msg);
                ps.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}