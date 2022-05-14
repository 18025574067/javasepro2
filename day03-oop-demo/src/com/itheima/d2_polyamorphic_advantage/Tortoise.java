package com.itheima.d2_polyamorphic_advantage;

public class Tortoise extends Animal {
    public String name = "子类乌龟";
    @Override
    public void run() {
        System.out.println("乌龟根本跑不动~~~~~~~~~~");
    }
}
