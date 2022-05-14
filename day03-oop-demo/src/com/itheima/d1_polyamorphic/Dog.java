package com.itheima.d1_polyamorphic;

public class Dog extends Animal{
    public String name = "子类狗";

    @Override
    public void run() {
        System.out.println("狗跑得贼溜～～～～～～～～～～～～");
    }


}
