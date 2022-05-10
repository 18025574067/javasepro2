package com.itheima.d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        // 目标：理解抽象类的特征和注意事项。
        // 1. 类有的东西，抽象类都有
        // 2. 抽象类中可以没有抽象方法，但是抽象方法必须有抽象类
        // 3. 一个类继承了抽象类，必须重写抽象类的全部抽象方法，否则必须也定义为抽象类，
    }
}

//abstract class Animal{
//
//}

class Cat extends Animal{

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }
}

abstract class Animal{
    public abstract void run();
    public abstract void eat();
}