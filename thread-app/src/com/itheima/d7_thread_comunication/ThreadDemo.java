package com.itheima.d7_thread_comunication;

public class ThreadDemo {
    public static void main(String[] args) {
        // 目标：了解线程通信的流程。
        // 使用3个爸爸存钱(生产者)，2个孩子取钱(消费者)，模拟线程通信思想（一存10万，一取10万）
        // 创建账户对象，代表5个人共同操作的账户。
        Account acc = new Account("ICBC-112", 0);
        // 创建2个取钱线程，代表小明和小红
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();

        // 创建3个存钱线程，代表亲爹，干爹，岳父。
        new DepositThread(acc, "亲爹").start();
        new DepositThread(acc, "干爹").start();
        new DepositThread(acc, "岳父").start();

    }
}
