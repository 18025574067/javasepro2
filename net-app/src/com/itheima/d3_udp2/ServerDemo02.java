package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
    接收端：多发多收
 */
public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("========服务端启动========");
        // 1. 创建服务端对象，注册端口（人）
        DatagramSocket socket = new DatagramSocket(8080);

        // 2. 创建一个数据包对象接收数据（韭菜盘子）
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            // 3. 等待接收数据
            socket.receive(packet);

            // 4. 输出数据
            int length = packet.getLength();
            String rs = new String(buffer, 0, length);
            System.out.println("接收到了来自：" + packet.getAddress() + ", 端口号为：" + packet.getPort() +"的信息：" +rs);
        }
    }
}