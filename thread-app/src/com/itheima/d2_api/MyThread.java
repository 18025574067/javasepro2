package com.itheima.d2_api;

public class MyThread extends Thread{
    public MyThread(String name) {
        // 为当前线程设置名称，送给父类的有参构造器初始化名称。
        super(name);
    }

    public MyThread() {
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
        }
    }
}
