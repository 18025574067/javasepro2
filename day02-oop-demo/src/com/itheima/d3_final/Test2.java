package com.itheima.d3_final;

public class Test2 {

    /**
     二、修饰静态成员变量（public static final修饰也称为：常量）
     */
    public static final String schoolName = "黑马";

    /**
        三、修饰实例成员变量 (几乎不用)
     */
    private final String name = "猪八戒";


    public static void main(String[] args) {
        // 目标：理解final 修饰变量，总规则：有且只能被赋值一次(理解语法)
        // java 中变量有两种：
        // 1. 局部变量
        // 2. 成员变量
        //          -- 实例成员变量
        //          -- 静态成员变量

        // 一、修饰局部变量
        final double rate = 3.14;
//        rate = 3.19; // 第二次赋值了。
        buy(0.8);

//        schoolName = "黑马程序员"; // 第二次被赋值。

        Test2 t = new Test2();
        System.out.println(t.name);
//        t.name = "天蓬元帅";

        // 注意：final 修饰引用类型的变量 ，其指向的地址值不能改变，但其指向对象的内容可以发生改变。
        final Teacher t2 = new Teacher("学习，授课，吹吹水");
        System.out.println(t2.getHobby());
//        t2 = null;
        t2.setHobby("运动");
        System.out.println(t2.getHobby());


    }
    public static void buy(final double a){
//        a = 0.1; // 第二次赋值了。
    }
}

class Teacher{
    // 私有化成员变量
    private String hobby;

    // 有参构造器
    public Teacher(String hobby) {
        this.hobby = hobby;
    }

    // getter方法
    public String getHobby() {
        return hobby;
    }

    // setter方法
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
