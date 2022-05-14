package com.itheima.d3_polyamorphic_convert;

public class Dog extends Animal {

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
