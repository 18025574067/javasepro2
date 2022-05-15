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
        Animal a2 = new Dog();
        a2.run();

        // Tortoise d = (Tortoise) a2; // 强制类型转换，编译阶段不报错的（注意：有继承关系和实现关系阶段可以强制转换，没毛病），运行阶段报错。
        // ClassCastException错误

        if (a2 instanceof Tortoise){
            Tortoise t = (Tortoise) a2; // 从父类类型转换成子类类型，必须强制转换。
            t.layEggs();
        }else if (a2 instanceof Dog){
            Dog d = (Dog) a2;
            d.lookDoor();
        }
        System.out.println("----------------------");
        go(new Dog());
        System.out.println("----------------------");
        go(new Tortoise());
    }
    public static void go(Animal a){
        a.run();
        if (a instanceof Tortoise){
            // a到底是狗还是乌龟？
            Tortoise t = (Tortoise) a;
            t.layEggs();
        }else if (a instanceof Dog){
            Dog d = (Dog) a;
            d.lookDoor();
        }
    }
}
