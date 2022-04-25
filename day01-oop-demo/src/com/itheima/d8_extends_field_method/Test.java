package com.itheima.d8_extends_field_method;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承后成员的访问特点：就近原则。
        Dog d = new Dog();
        d.run(); // 子类
        d.lookDoor(); // 子类的
        d.showName();

    }
}

class Animal{
    public String name = "动物名";
    public void run(){
        System.out.println("动物会跑。。。");
    }
}


class Dog extends Animal{
    public String name = "狗名";
    public void lookDoor(){
        System.out.println("狗会看门。。。");

    }
    public void run(){
        System.out.println("狗跑得贼快。。。");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        run(); // 找子类的方法
        super.run(); // 找父类的方法。
    }
}