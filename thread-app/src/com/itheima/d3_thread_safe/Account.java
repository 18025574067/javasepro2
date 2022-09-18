package com.itheima.d3_thread_safe;

public class Account {
    private String name;
    private double money;

    public Account(){
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void drawMoney(double money) {
        // 0. 先获取是谁来取钱，线程的名字就是人名
        String name = Thread.currentThread().getName();
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

}
