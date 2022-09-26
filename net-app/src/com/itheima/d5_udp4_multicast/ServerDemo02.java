package com.itheima.d5_udp4_multicast;

import java.net.*;

/**
    接收端：组播
 */
public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("========服务端启动========");
        // 1. 创建服务端对象，注册端口（人）
        MulticastSocket socket = new MulticastSocket(9999);

        // 把当前接收端加入到一个组播组中去，绑定对应的组播消息的组播IP。
//        socket.joinGroup(InetAddress.getByName("244.0.1.1")); // 过期了
        socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.1"), 9999),
                NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

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