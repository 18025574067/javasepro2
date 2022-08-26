package com.itheima.d2_recursion;

/**
    猴子吃桃：
    公式（数学科学性）f(x) - f(x)/2 -1 = f(x+1)
                    2f(x) - f(x) -2 = 2f(x+1)
                    f(x) = 2f(x+1) + 2
    终点：f(10) = 1;
    求f(1) = ?

 */
public class RecursionDemo04 {
    public static void main(String[] args) {
        System.out.println(f(1));
    }

    public static int f(int n){
        if (n == 10){
            return 1;
        }else {
            return 2 * f(n+1) + 2;
        }
    }
}
