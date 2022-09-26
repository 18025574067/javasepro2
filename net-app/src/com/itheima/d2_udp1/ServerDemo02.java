package com.itheima.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
    接收端。
 */
public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("========服务端启动========");
        // 1. 创建注册端对象，注册端口（人）
        DatagramSocket socket = new DatagramSocket(8888);

        // 2. 创建一个数据包对象接收数据（韭菜盘子）
        /**
         public DatagramPacket(byte buf[], int length) {
         this (buf, 0, length);
         */
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // 3. 等待接收数据
        socket.receive(packet);

        // 4. 输出数据
        int length = packet.getLength();
        String rs = new String(buffer, 0, length);
        System.out.println("接收到了：" +rs);

        // 获取发送端的IP和端口
        String ip = packet.getSocketAddress().toString();
        System.out.println("对方的地址是：" + ip);

        int port = packet.getPort();
        System.out.println("对方的端口是：" + port);

        // 5. 关闭连接
        socket.close();
    }
}