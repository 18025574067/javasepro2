package com.itheima.d2_polyamorphic_advantage;

public class Dog extends Animal {
    public String name = "子类狗";

    @Override
    public void run() {
        System.out.println("狗跑得贼溜～～～～～～～～～～～～");
    }

    /**
        独有功能：看门
     */
    public void lookDoor(){
        System.out.println("狗在看门。。。");
    }
}
