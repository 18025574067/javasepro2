package com.itheima.d9_timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
    目标：使用ScheduledExecutorService创建定时器的使用和了解，与不干扰。
*/

public class TimerDemo02 {
    public static void main(String[] args) {

//        Thread.State;

        // 1. 创建scheduledExecutorService线程池，做定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        // 2. 开启定时任务
        pool.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + "执行输出：AAA ==> " + new Date());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2, TimeUnit.SECONDS);
 
        pool.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + "执行输出：BBB ==> " + new Date());
                System.out.println(10 / 0);
            }
        }, 0, 2, TimeUnit.SECONDS);
    
        pool.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + "执行输出：CCC ==> " + new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}






