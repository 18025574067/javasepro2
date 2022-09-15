package com.itheima.d1_create;

/**
    目标：学会创建线程方式二(匿名内部方式实现)

 */
public class ThreadDemo02Other {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1执行输出：" + i);
                }
            }
        };
        Thread t = new Thread(target);
        t.start();


        new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2执行输出：" + i);
                }
            }
        }).start();


        new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程3执行输出：" + i);
                }
        }).start();


        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

