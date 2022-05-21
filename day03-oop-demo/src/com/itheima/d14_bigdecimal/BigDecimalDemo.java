package com.itheima.d14_bigdecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 浮点型运算的时候直接+-*/可能会出现数据失真（精度问题）。
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);
        System.out.println("------------------------------");
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("-----------------------------------");

        // 包装浮点型数据成为大数据对象
        System.out.println("-------------------------------");
    }
}
