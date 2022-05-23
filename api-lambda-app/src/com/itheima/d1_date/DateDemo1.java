package com.itheima.d1_date;

import java.util.Date;

/**
    目标：学会使用Date类处理时间，获取时间的信息。
 */
public class DateDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个Date类的对象，代表此刻时间日期对象。
        Date d = new Date();
        System.out.println(d);

//        Mon May 23 21:45:46 CST 2022

        // 2. 获取当前时间毫秒值。
//        1653314254951
        long time = d.getTime();
        System.out.println(time);

        long time1 = System.currentTimeMillis();
        System.out.println(time1);

        // 3. 案例：请计算出当前时间往后走1小时121秒之后的时间是多少。
        System.out.println("===============================================");

        // 1）得到当前时间
        Date d1 = new Date();
        System.out.println(d1);

        // 2）当前时间继续走1小时121秒
        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 + 121) * 1000;

        // 3）时间毫秒值转换成时间对象
//        Date d2 = new Date(time2);
//        System.out.println(d2);

        Date d3 = new Date();
        d3.setTime(time2);
        System.out.println(d3);

    }
}
