package com.itheima.d2_polyamorphic_advantage;


public class Test {
    public static void main(String[] args) {
        // 多态的形式：父类名称 对象名 = new 子类构造器();
        Animal a1 = new Dog();
        go(a1);

        Animal a2 = new Tortoise();
        go(a2);

        // a2.lookDoor(); // 多态下不能访问子类独有功能。
    }

    /**
        要求所有动物进来比赛
     */
    public static void go(Animal a){
        System.out.println("开始比赛。。。");
        a.run();
        System.out.println("比赛结束。。。");
    }
}
