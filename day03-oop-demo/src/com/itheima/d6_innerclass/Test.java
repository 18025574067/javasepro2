package com.itheima.d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.setName("成员内部类");
        in.show();
        Outer.Inner.test();

        Outer.Inner in2 = new Outer("爱听歌").new Inner();
        in2.setName("张三");
        in2.show();
    }

}
