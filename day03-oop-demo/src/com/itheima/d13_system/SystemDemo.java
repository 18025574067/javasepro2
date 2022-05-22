package com.itheima.d13_system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
//         System.exit(0); // JVM终止。
        // 2. 计算机认为时间有起源：返回1970-1-1 00:00:00 直到此刻的总的毫秒值。
        // 1s = 1000ms
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 进行时间的计算，性能分析
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出：" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0 + "s");

        // 3. 做数组拷贝（了解）
        /**
         arraycopy(Object src, int srcPls,
         Object dest, int destPls,
         int length)
         */
        // 参数一：被拷贝的数组
        // 参数二：从哪个索引开始拷贝
        // 参数三：复制的目标数组
        // 参数四：粘贴位置
        // 参数五：拷贝元素的个数。
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6]; // [0, 0, 0, 0, 0, 0] == [0, 0, 40, 50, 60, 0]
        System.arraycopy(arr1, 3, arr2, 2, 3);
        System.out.println(Arrays.toString(arr2));

        System.out.println("程序结束。。。");
    }
}
