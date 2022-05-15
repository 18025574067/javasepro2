package com.itheima.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inter in = new Outer.Inter();
        in.setName("张三");
        in.show();
    }
}
