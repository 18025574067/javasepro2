package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Demo04UpdateTime {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime); //当前时间
        System.out.println(nowTime.minusHours(1)); // 一小时前
        System.out.println(nowTime.minusMinutes(1)); // 一分钟前
        System.out.println(nowTime.minusSeconds(1)); // 一秒前
        System.out.println(nowTime.minusNanos(1)); // 一纳秒前

        System.out.println(nowTime.plusHours(1)); // 一小时后
        System.out.println(nowTime.plusMinutes(1)); // 一分钟后
        System.out.println(nowTime.plusSeconds(1)); // 一秒后
        System.out.println(nowTime.plusNanos(1)); // 一纳秒后

        System.out.println("---------------------");
        LocalDate myDate = LocalDate.of(2022, 5, 20);
        LocalDate nowDate = LocalDate.now();

        System.out.println("今天是2022-05-19吗？" + nowDate.equals(myDate));
        System.out.println(myDate + "是否在" + nowDate + "之前？" + myDate.isBefore(nowDate));
        System.out.println(myDate + "是否在" + nowDate + "之前？" + myDate.isAfter(nowDate));

        System.out.println("---------------------------");

        // 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(1984, 12, 1);



    }
}
