package com.itheima.d12_math;

public class MathDemo {
    public static void main(String[] args) {
        // 1. 取绝对值：返回正数。
        System.out.println(Math.abs(10)); // 10
        System.out.println(Math.abs(-10.3)); // 10.3
        // 2. 向上取整：5
        System.out.println(Math.ceil(4.000000000000001)); // 5
        System.out.println(Math.ceil(4.0)); // 4
        // 3. 向下取整：4
        System.out.println(Math.floor(4.9999999999999)); // 4
        // 4. 求指数次方
        System.out.println(Math.pow(2, 10)); // 81

        // 5. 四舍五入 10
        System.out.println(Math.round(4.499999)); // 4
        System.out.println(Math.round(4.54444444444444)); // 5
        // 6. 0.1-1.0的随机小数
        System.out.println(Math.random());

        // 随机生成3-9的随机数
        // (0-7) + 3
        for (int i = 0; i < 20; i++) {
            int data =  (int)((Math.random() * 7 + 3));
            System.out.println(data);
        }
    }
}
