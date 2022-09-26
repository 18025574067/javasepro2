package com.itheima.d5_udp4_multicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
    发送端: 组播。
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("========客户端启动========");
        // 1. 创建发送端的对象，发送端自带默认的端口, 可不指定端口。
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请讲：");
            String msg = sc.nextLine();
            if ("exit".equals(msg)){
                System.out.println("再见！");
                socket.close();
                return;
            }
            // 2. 创建一个数据包封装数据（韭菜盘子）
            byte[] buffer = (msg + "\r\n").getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
                    InetAddress.getByName("224.0.1.1"), 9999);

            // 3. 发送数据出去
            socket.send(packet);
        }
    }
}