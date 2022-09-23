package com.itheima.d8_threadpool;

import java.util.concurrent.*;

/**
    目标：使用Executors线程池方法得到一个线程池对象。
 */

public class ThreadPoolDemo03 {
    public static void main(String[] args){
        // 1. 创建固定线程数据的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3); // 大型并发会出现内存溢出。

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable()); // 已经没有多余线程了。
    }
}
