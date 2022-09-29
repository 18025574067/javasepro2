package com.itheima.d10_socket5_sms;

import java.io.*;
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

            // 创建一个独立的线程专门负责这个客户端用于收消息，服务端随时发送消息过来
            new ClientReaderThread(socket).start();

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

class ClientReaderThread extends Thread{
    private Socket socket;

    public ClientReaderThread(Socket socket){
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
                System.out.println("收到消息：" + msg);
            }
        } catch (Exception e) {
            System.out.println("服务端把我踢出来了！");
        }
    }
}