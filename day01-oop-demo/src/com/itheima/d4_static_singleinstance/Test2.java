package com.itheima.d4_static_singleinstance;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握懒汉单例的设计，理解其思想。
//        Singleinstance2 s3 = Singleinstance2.instance;
//        Singleinstance2 s4 = Singleinstance2.instance;
        Singleinstance2 s1 = Singleinstance2.getInstance();
        Singleinstance2 s2 = Singleinstance2.getInstance();
        System.out.println(s1 == s2);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
    }
}
