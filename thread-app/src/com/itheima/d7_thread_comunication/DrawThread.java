package com.itheima.d7_thread_comunication;

/**取钱线程类*/
public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true) {
            // 小明，小红来取钱
            acc.drawMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
