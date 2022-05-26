package com.itheima.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Demo02LocalTime {
    public static void main(String[] args) {
        // 1. 获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间： " + nowTime); // 今天的时间。

        int hour = nowTime.getHour(); // 时
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute(); // 分
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond(); // 秒
        System.out.println("second: " + second);

        int nano = nowTime.getNano(); // 纳秒
        System.out.println("nano: " + nano);

        System.out.println("-----------------");
        System.out.println(LocalTime.of(8, 20));
        System.out.println(LocalTime.of(8, 20, 30));
        System.out.println(LocalTime.of(8, 20, 30, 20));
        LocalTime mTime = LocalTime.of(8, 20, 30, 30);

        System.out.println("----------------------");
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER, 11, 12, 30, 12));
        System.out.println(LocalDateTime.of(1991,11, 11, 12, 30, 12));

    }
}
