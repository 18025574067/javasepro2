package com.itheima.d1_static;

public class Test3 {

    /**
        静态成员
     */
    public static int onlineNumber = 10;
    public static void Test2(){
        System.out.println("===test2===");
    }

    /**
        实例成员
     */
    private String name;
    public void run(){
        System.out.println(name + "跑得快");
        System.out.println(this);
    }

    // 1. 静态方法只能访问静态成员，不能直接访问实例成员。
    public static void Test(){
        System.out.println(Test3.onlineNumber);
        System.out.println(onlineNumber);
        Test2();
//        System.out.println(name); // 直接访问，报错
        Test3 t = new Test3();
        System.out.println(t.name);
    }

    // 2. 实例方法可以访问静态成员，也可以访问实例成员
    public void go(){
        System.out.println(Test3.onlineNumber);
        System.out.println(onlineNumber);
        Test2();

        System.out.println(name);
        run();
    }

    // 3. 静态方法不能出现this 关键字
    public static void test3(){
//        System.out.println(this); // this只能代表当前对象，静态方法可以不用方法调用
    }

    public static void main(String[] args) {
        // 目标：理解static访问相关的语法：面试笔试题，或者以后理解程序很重要的知识（拓展）
    }
}
