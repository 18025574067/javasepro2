package com.itheima.d3_exception;

/**
    Exception异常的分类：
        1. 编译时异常：继承自Exception的异常或者其子类，编译阶段就会报错。
            必须程序员处理的，否则代码编译就不能通过！
        2. 运行时异常：继承自RuntimeException的异常或者其子类，编译阶段是不会出错的，它是在
            运行时阶段可能出现，运行时异常可以处理也可以不处理，编译阶段是不会出错的。
    小结：
        异常是程序在编译或者运行的过程中可能出现的错误！！
        异常分为2类：编译时异常，运行时异常。
            -- 编译时异常：继承了Exception, 编译阶段就会报错，必须处理，否则代码不通过。
            -- 运行时异常：继承了RuntimeException, 编译阶段不会报错，运行时才可能出现。
        异常一旦真的出现，程序会终止，所以要研究异常，避免异常，处理异常，程序更健壮！！
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arrs = {10, 23, 44,55};
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);
        System.out.println(arrs[3]);
        System.out.println(arrs[4]);
        System.out.println("=============程序结束==============");

    }
}
