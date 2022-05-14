package com.itheima.d1_polyamorphic;

/**
    认识多态，理解多态的形式，和概念。
 */
public class Test {
    public static void main(String[] args) {
        // 多态的形式：父类名称 对象名 = new 子类构造器();
//        Dog a1 = new Dog();
        Animal a1 = new Dog();
        a1.run(); // 多态方法，编译看左边，运行看右边。
        System.out.println(a1.name); // 多态变量，编译看左边，运行还是看左边

//        Tortoise a2 = new Tortoise();
        Animal a2 = new Tortoise();
        a2.run();
        System.out.println(a2.name);
    }
}
