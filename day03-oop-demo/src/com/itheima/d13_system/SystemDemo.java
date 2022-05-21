package com.itheima.d13_system;

/**
    参数三：目标数组
    参数四：赋值到目标数组的哪个位置
    参数五：赋值几个。
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
//         System.exit(0); // JVM终止。
        // 1s = 1000ms

        // 2. 计算机认为为时间有起源：返回1970-1-1 00:00:00 直到此刻的总的毫秒值，时间毫秒值。
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
        System.out.println("程序结束。。。");
    }
}
