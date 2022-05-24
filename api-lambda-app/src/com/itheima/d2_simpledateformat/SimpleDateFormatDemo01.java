package com.itheima.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
    目标：SimpleDateFormat简单日期格式化类的使用
    格式化时间
    解析时间

 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        // 1. 日期对象
        Date d = new Date();
        System.out.println(d);

        // 2. 格式化日期对象
//        2022年05月24日  22:29:43 Tue PM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss EEE a");

        // 3. 开始格式化日期对象成为喜欢的字符串格式
        System.out.println(sdf.format(d));
        
        System.out.println("=============================");

        // 4. 格式化时间毫秒值
        // 需求：请问121秒后的时间是多少？
        long time = System.currentTimeMillis() + 121*1000;
        String rs = sdf.format(time);
        System.out.println(rs);

    }
}
