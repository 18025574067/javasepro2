package com.itheima.d9_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
    目标：Timer定时器的使用和了解。
*/

public class TimerDemo01 {
    public static void main(String[] args) {
        // 1. 创建Timer定时器
        Timer timer = new Timer();
        // 2. 调用方法，处理定时任务
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + "执行AA一次～～～" + new Date());
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }, 0, 2000);

        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + "执行BB一次～～～" + new Date());
                System.out.println(10/0);
            }
        }, 0, 2000);

        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + "执行CCC一次～～～" + new Date());
            }
        }, 0, 2000);
    }
}
