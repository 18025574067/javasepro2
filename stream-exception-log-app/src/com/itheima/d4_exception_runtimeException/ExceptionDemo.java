package com.itheima.d4_exception_runtimeException;

/**
        5. 数学操作异常：ArithmeticException.
        6. 数学转换异常：NumberFormatException.

    小结：
        运行时异常继承了RuntimeException, 编译阶段不报错，运行时才可能会出现错误！
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。");
        /**1. 数组索引越界异常：ArrayIndexOutOfBoundsException.*/
        int[] arrs = {1, 2, 3};
        System.out.println(arrs[2]);
//        System.out.println(arrs[3]); // 运行出错，程序终止

        /**2. 空指针异常：NullPointerException.直接输出没有问题，但是调用空指针的变量的功能就会出异常*/
        String name = null;
        System.out.println(name);
//        System.out.println(name.length()); //  运行出错，程序终止

        /**3. 类型转换异常：ClassCastException.*/
        Object o = 23;
//        String i = (String) o; //  运行出错，程序终止

        /**5. 数学操作异常：ArithmeticException.*/
//        int i = 10/0;

        /**6. 数字转换异常：NumberFormatException.*/
//        String number = "23";
        String number = "23aaa";
        Integer it = Integer.valueOf(number); //  运行出错，程序终止
        System.out.println(it + 1);

        System.out.println("程序结束。。。。。。");
    }
}
