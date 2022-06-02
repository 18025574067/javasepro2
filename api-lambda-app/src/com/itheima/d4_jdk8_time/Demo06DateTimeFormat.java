package com.itheima.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo06DateTimeFormat {
    public static void main(String[] args) {
        // 本地此刻 日期时间 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 解析/格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        // 正向格式化
        String ldtStr = ldt.format(dtf);
        System.out.println(ldtStr);

        // 逆向格式化
        String dtfStr = dtf.format(ldt);
        System.out.println(dtfStr);

        // 解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2019-10-1 12:14:30";

        // 解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1 = LocalDateTime.parse(dateStr, dtf1);
        System.out.println(ldt1);
    }
}
