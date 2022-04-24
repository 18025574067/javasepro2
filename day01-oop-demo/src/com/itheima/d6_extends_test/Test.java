package com.itheima.d6_extends_test;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承的设计思想
        Students s = new Students();
        s.setName("蜘蛛精"); // 使用父类的
        s.setAge(999); // 使用父类的
        System.out.println(s.getName()); // 使用父类
        System.out.println(s.getAge()); // 使用父类
        s.writeInfo(); // 子类的方法
        s.queryCourse(); // 调用父类的。
    }
}
