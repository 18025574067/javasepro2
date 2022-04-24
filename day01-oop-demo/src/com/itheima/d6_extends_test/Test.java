package com.itheima.d6_extends_test;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承的设计思想
        Students s = new Students();
        s.setName("蜘蛛精");
        s.setAge(999);
        s.writeInfo();
        s.queryCourse();
    }
}
