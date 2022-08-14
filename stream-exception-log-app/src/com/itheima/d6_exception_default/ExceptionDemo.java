package com.itheima.d6_exception_default;

/**
        默认的异常处理机制并不好，一旦真的出现异常，程序立即死亡！
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始-------------------");
        chu(12, 5);
        System.out.println("程序结束-------------------");
    }
    public static void chu(int a, int b){
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
