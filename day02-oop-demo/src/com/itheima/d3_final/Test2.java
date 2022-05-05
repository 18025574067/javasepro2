package com.itheima.d3_final;

public class Test2 {

    /**
     二、修饰静态成员变量（修饰也称为：常量）
     */
    public static final String schoolName = "黑马";

    /**
        三、修饰实例成员变量 (几乎不用)
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
//        t.name = "天蓬元帅";

        // 注意：final 修饰引用类型的变量 ，其指向的地址值不能改变，但其指向对象的内容可以发生改变。
        Teacher t2 = new Teacher("学习", "授课", "吹吹水");


    }
    public static void buy(final double a){
//        a = 0.1; // 第二次赋值了。
    }
}

class Teacher{
    private String hobby;

    public Teacher(String 学习, String 授课, String 吹吹水) {
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
