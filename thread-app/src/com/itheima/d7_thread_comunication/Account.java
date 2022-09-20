package com.itheima.d7_thread_comunication;

/**账户类*/
public class Account {
    private String name;
    private double money;

    public Account(){
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    /**
     小明，小红取钱, 必须先保证线程安全
     */
    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money >= money){
                // 钱够，可取
                this.money -= money;
                System.out.println(name + "来取钱" + money +"成功，余额为：" + this.money);
                // 没钱了，
                // 唤醒别人，等待自己。
                this.notifyAll(); // 唤醒其他所以人。
                this.wait(); // 锁对象，让当前线程进入等待

            }else {
                // 钱不够，不可取
                // 唤醒别人，等待自己。
                this.notifyAll(); // 唤醒其他所以人。
                this.wait(); // 锁对象，让当前线程进入等待。要先唤醒别人，自己才能睡觉。
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
        存款
     */
    public void depositMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money == 0){
                // 钱够，可取
                this.money += money;
                System.out.println(name + "来存" + money +"成功，余额为：" + this.money);
                // 有钱了，
                // 唤醒别人，等待自己。
                this.notifyAll(); // 唤醒其他所以人。
                this.wait(); // 锁对象，让当前线程进入等待

            }else {
                // 钱够了，可取
                // 唤醒别人，等待自己。
                this.notifyAll(); // 唤醒其他所以人。
                this.wait(); // 锁对象，让当前线程进入等待。要先唤醒别人，自己才能睡觉。
            }
        } catch (Exception e) {
            e.printStackTrace();
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
