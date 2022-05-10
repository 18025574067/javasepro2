package com.itheima.d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        // 目标：理解抽象类的特征和注意事项。
        // 1. 类有的东西，抽象类都有
        // 2. 抽象类中可以没有抽象方法，但是抽象方法必须有抽象类
        // 3. 一个类继承了抽象类，必须重写抽象类的全部抽象方法，否则必须也定义为抽象类，会报错
        // 4. abstract不能修饰变量，构造器，代码块。
        // 5. 抽象类不能创建对象。为什么？
        // 反证法：假如抽象类可以创建对象，
        // Animal a = new Animal(); a.run(), 连方法体都没有怎么跑？
        // 因此抽象类不能创建对象。

        // Card c = new Card();
        // 抽象类不能创建对象（这个观点不能动摇）
    }
}

abstract class Card{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


abstract class Cat extends Animal{

    @Override
    public void run() {
    }
}

abstract class Animal{
    public abstract void run();
    public abstract void eat();
}