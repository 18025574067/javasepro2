package com.itheima.d4_jdk8_time;

import java.time.Instant;

public class Demo05Instant {
    public static void main(String[] args) {
        // 1. 得到一个Instant 时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
