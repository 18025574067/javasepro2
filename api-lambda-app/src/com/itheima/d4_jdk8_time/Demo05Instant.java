package com.itheima.d4_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Demo05Instant {
    public static void main(String[] args) {
        // 1. 得到一个Instant 时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // 2. 系统此刻的时间怎么办？
        Instant instant1 = Instant.now();
        System.out.println(instant.atZone(ZoneId.systemDefault()));

        // 3. Instant 和 Date 互转
        Date date = Date.from(instant);
        System.out.println(date);

        Instant instant2 = date.toInstant();
        System.out.println(instant2);
    }
}
