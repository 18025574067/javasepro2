package com.itheima.d2_api;
/**
    目标：线程的API
*/
public class ThreadDemo01 {
    // main方法是由主线程负责调度的
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();

        Thread t2 = new MyThread();
        t2.start();

        for(int i = 0; i < 5; i++){
            System.out.println("主线程输出：" + i);
        }
    }
}
