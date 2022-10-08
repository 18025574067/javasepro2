package com.itheima.d8_annotation;

/**
    目标：认识元注解
 */
// @MyTest // 报错，只能注释方法和成员变量
public class AnnotationDemo02 {
    @MyTest
    private String name;

    @MyTest
    public void test(){}

    public static void main(String[] args){}
}
