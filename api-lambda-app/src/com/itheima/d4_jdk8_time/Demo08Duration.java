package com.itheima.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo08Duration {
    public static void main(String[] args) {
        // 本地日期时间对象。
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 出生的日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(1984, 12, 12, 0, 0, 0);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today); // 第二个参数减去第一个参数
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());

    }
}
