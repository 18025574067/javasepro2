package com.itheima.d8_threadpool;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + "输出了：HelloWorld ==> " + i);
        }
    }
}