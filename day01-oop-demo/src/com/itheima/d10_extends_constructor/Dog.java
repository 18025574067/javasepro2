package com.itheima.d10_extends_constructor;

public class Dog extends Animal {
    public Dog(){
        super(); // 写不写都有，默认找父类的无参构造器执行
        System.out.println("子类Dog的无参构造器被执行...");
    }

    public Dog(String name){
        super(); // 写不写都有，默认找父类的无参构造器执行
        System.out.println("子类Dog的有参构造器被执行...");
    }
}
