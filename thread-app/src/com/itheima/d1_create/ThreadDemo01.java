package com.itheima.d1_create;

/**
    目标：创建多线程方式一：继承Thread类实现。
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        // 3. new一个新线程对象
        Thread myThread = new MyThread();
        // 4. 起动线程
        myThread.start();
        // myThread.run(); // 不能直接调用run()方法，会变成普通方法执行，单线程。

        // 主线程任务要放在子线后面，不然会等主线程任务执行后才执行子线程。
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出" + i);
        }
    }
}

/**
    1. 定义一个线程类继承Thread类
 */
class MyThread extends Thread{
    // 2. 重写run()方法，里面是定义线程以后要干什么。
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出" + i);
        }
    }
}
