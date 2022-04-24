package com.itheima.d7_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承的特点。
        // 1. 子类可以继承父类的属性和方法，不能继承父类的构造器
        // 2. 子类是否可以继承父类的私有成员？我认为是可以继承父类私有成员的，只是不可以直接访问的。
        Tiger t = new Tiger();
        // t.eat();

        // 3. 子类是否可以继承父类的静态成员？我认为不算继承，是共享父类的静态成员。
        System.out.println(Tiger.location);

        // 4.
    }
}

class Animal{
    private void eat(){
        System.out.println("动物会吃东西。。。");
    }
    public static String location = "长隆动物园";

}


class Tiger extends Animal{

}



