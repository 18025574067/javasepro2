package com.itheima.d9_socket4_threadpool;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
    拓展：使用线程池优化，实现通信
 */
public class ServerDemo02 {

    // 使用静态变量记住一个线程对象
    /**
       public ThreadPoolExecutor(int corePoolSize,
                                 int maximumPoolSize,
                                 long keepAliveTime,
                                 TimeUnit unit,
                                 BlockingQueue<Runnable> workQueue,
                                 ThreadFactory threadFactory,
                                 RejectedExecutionHandler handler)
     */
    private static ExecutorService pool = new ThreadPoolExecutor(3, 5,
            6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        System.out.println("==========服务端启动成功===========");
        try {
            // 1. 注册端口
            ServerSocket serverSocket = new ServerSocket(7777);

            // a. 定义一个死循环由主线程负责不断的接收客户端的socket连接请求，
            while (true){
                // b. 每接到一个客户端socket管道，
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");

                // 任务对象负责读取消息。
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}