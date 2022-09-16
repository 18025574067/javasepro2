package com.itheima.d2_api;
/**
    目标：线程的API
*/
public class ThreadDemo01 {
    // main方法是由主线程负责调度的
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.setName("1号");
        t.start();
        System.out.println(t.getName());

        Thread t2 = new MyThread();
        t2.setName("2号");
        t2.start();
        System.out.println(t2.getName());

        // 哪个线程执行它，它就得到哪个线程对象（当前线程）
        // 主线程的名称就叫mian
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for(int i = 0; i < 5; i++){
            System.out.println("main线程输出：" + i);
        }
    }
}
