package com.itheima.d2_recursion;

public class RecursionDemo01 {
    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        System.out.println("==============test2被执行了=================");
        test3();

    }

    private static void test3() {
        System.out.println("==============test3被执行了=================");
        test2(); // 方法递归，间接递归形式。

    }


    public static void test(){
        System.out.println("==============test被执行了=================");
        test(); // 方法递归，直接递归形式。
    }


}
