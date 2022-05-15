package com.itheima.d3_polyamorphic_convert;

public class Tortoise extends Animal {
    @Override
    public void run() {
        System.out.println("乌龟根本跑不动~~~~~~~~~~");
    }
    /**
     独有功能：乌龟下蛋。
     */
    public void layEggs(){
        System.out.println("乌龟会下蛋。。。");
    }
}
