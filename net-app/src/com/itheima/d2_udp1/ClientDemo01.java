package com.itheima.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/**
    发送端。
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("========客户端启动========");

        // 1. 创建发送端的对象，发送端自带默认的端口, 可不指定端口。
        DatagramSocket socket = new DatagramSocket(8889);

        // 2. 创建一个数据包封装数据（韭菜盘子）
        /** public DatagramPacket(byte buf[], int offset, int length,
        InetAddress address, int port)
         参数一：要发送的字节数组（韭菜）
         参数二：要发送的字节数组长度
         参数三：服务端的IP地址
         参数四：服务端的端口
         */
        byte[] buffer = "我是一颗快乐的韭菜，你愿意吃我吗？".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
                InetAddress.getLocalHost(), 8888);

        // 3. 发送数据出去
        socket.send(packet);

        // 4. 关闭连接
        socket.close();
    }
}