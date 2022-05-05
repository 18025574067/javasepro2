package com.itheima.d3_final;

public class Test2 {

    /**
     二、修饰静态成员变量（修饰也称为：常量）
     */
    public static final String schoolName = "黑马";

    /**
        三、修饰实例成员变量
     */
    private final String name = "猪八戒";


    public static void main(String[] args) {
        // 目标：理解final 修饰变量，总规则：有且只能被赋值一次。
        // java 中变量有两种：
        // 1. 局部变量
        // 2. 成员变量
        //          -- 实例成员变量
        //          -- 静态成员变量

        // 一、局部变量
        final double rate = 3.14;
//        rate = 3.19; // 第二次赋值了。
        buy(0.8);

//        schoolName = "白马"; // 第二次被赋值。

        Test2 t = new Test2();
        System.out.println(t.name);


    }
    public static void buy(final double a){
//        a = 0.1; // 第二次赋值了。
    }
}
