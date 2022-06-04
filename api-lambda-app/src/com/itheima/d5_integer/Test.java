package com.itheima.d5_integer;

/**
    目标：明白包装类的概念，并使用
 */
public class Test {
    public static void main(String[] args) {
        int a = 100;
        Integer a1 = 111;
        Integer a2 = a; // 自动装箱
        System.out.println(a);
        System.out.println(a1);

        Integer it = 1;
        int it1 = it; // 自动拆箱

        double db = 99.5;
        Double db1 = db; // 自动装箱
        double db2 = db1; // 自动拆箱
        System.out.println(db2);

//        int age = null;
        Integer age1 = null;

    }
}
