package com.itheima.d2_recursion;

/**
    1-n的求和
 */
public class RecursionDemo03 {
    public static void main(String[] args) {
        System.out.println(f(100));
    }

    public static int f(int n){
        if (n == 1){
            return 1;
        }else {
            return f(n-1) + n;
        }
    }
}
