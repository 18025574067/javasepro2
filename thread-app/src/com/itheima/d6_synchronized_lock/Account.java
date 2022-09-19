package com.itheima.d6_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String name;
    private double money;
    // final修饰后，锁对象是唯一和不可替换的，非常专业。
    private final Lock lock = new ReentrantLock();

    public Account(){
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 成员方法建议使用this作为锁对象。
    public void drawMoney(double money) {
        // 0. 先获取是谁来取钱，线程的名字就是人名
        String name = Thread.currentThread().getName();
        lock.lock();
        try {
            // 1. 判断余额是否足够
            if (this.money >= money) {
                // 2. 取钱
                System.out.println(name + "来取钱了，吐出了：" + money);
                // 3. 更新余额
                this.money -= money;
                System.out.println(name + "取钱后，余额为：" + this.money);
            }else {
                // 4. 余额不足
                System.out.println(name + "来取钱，余额不足！！");
            }
        } finally {
            lock.unlock();
        }

    }
}
