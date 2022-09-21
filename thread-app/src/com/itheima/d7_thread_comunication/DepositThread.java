package com.itheima.d7_thread_comunication;

/**取钱线程类*/
public class DepositThread extends Thread{
    private Account acc;

    public DepositThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true) {
            // 3个爸爸来存钱。
            acc.depositMoney(100000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
