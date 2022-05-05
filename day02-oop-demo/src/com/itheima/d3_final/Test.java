package com.itheima.d3_final;

public class Test {
    public static void main(String[] args) {
        // 目标：记住final的语法。
        // 1. final 修饰类，类不能被继承、
        // 2. final 修饰方法，方法不能被重写。
        // 3. final 修饰变量，总规则：有且只能被赋值一次。
    }
}

class Student extends People{
//    @Override
//    public void eat() {
    // final修饰方法不能被重写。
//        System.out.println("学生很会吃东西的。。。");
//    }
}

class People{
    public final void eat(
    ){
        System.out.println("人都吃东西的。。。");
    }
}



//final class Animal{
//
//}
//
//class Wolf extends Animal{
//    // 报错，final修饰的类不能被继承。
// }


