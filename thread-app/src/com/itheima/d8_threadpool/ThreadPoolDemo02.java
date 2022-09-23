package com.itheima.d8_threadpool;

import java.util.concurrent.*;

/**
    目标：自定义一个线程池对象，并测试其特性。
 */

public class ThreadPoolDemo02 {
    public static void main(String[] args){
        // 1. 创建线程池对象
        /**
         ThreadPoolExecutor(int corePoolSize,
                             int maximumPoolSize,
                             long keepAliveTime,
                             TimeUnit unit,
                             BlockingQueue<Runnable> workQueue,
                             ThreadFactory threadFactory,
                             RejectedExecutionHandler handler)
        */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 5,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        // 2. 给任务让线程池处理



        // 关闭线程池，开发中一般不使用。
//        pool.shutdownNow(); // 立即关闭线程池，会丢失任务。

        pool.shutdown();   // 会等待线程全部结束再关闭

    }
}