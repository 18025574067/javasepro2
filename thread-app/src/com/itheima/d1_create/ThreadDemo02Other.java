package com.itheima.d1_create;

/**
    目标：学会创建线程方式二(匿名内部方式实现)

 */
public class ThreadDemo02Other {
    public static void main(String[] args) {
        // 3. 创建一个任务对象
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程执行输出：" + i);
                }
            }
        };

        // 4. 把任务对象交给线程对象处理。
        Thread t = new Thread(target);
        // 5. 启动线程
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}

