package com.itheima.d3_thread_safe;

/**
    需求：模拟取钱案例。
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 1. 定义一个账户类，创建一个共享的账户对象
        Account acc = new Account("ICBC-111", 100000);

        // 2. 创建两个线程对象，代表小红和小明同时进来了
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
    }
}
