package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class Demo07Period {
    public static void main(String[] args) {
        // 时间间隔计算
        // 当前时间
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 出生日期
        LocalDate brithDate = LocalDate.of(1984, 12, 12);
        LocalDate brithDate1 = LocalDate.of(2009, 8, 23);
        System.out.println(brithDate);
        System.out.println(brithDate1);

        // 计算间隔日期
        Period period = Period.between(brithDate, today); // 第二个对象减去第一个对象。
        Period period1 = Period.between(brithDate1, today);
//        System.out.println("年龄：%d 年, %d 月, %d 日", period.getYears(), period.getMonths(), period.getDays());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period1);
    }
}
