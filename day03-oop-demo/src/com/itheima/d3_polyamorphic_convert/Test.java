package com.itheima.d3_polyamorphic_convert;

/**
    目标：理解多态形式下类中的转换机制
 */
public class Test {
    public static void main(String[] args) {
        // 自动类型转换
        Animal a = new Dog();
        a.run();
        // 强制类型转换。
        Animal a2 = new Tortoise();
        a2.run();
        Tortoise t2 = (Tortoise)a2;
        t2.layEggs();
    }
}
