package com.itheima.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    案例：请计算出2021年08月06日11点11分11秒，往后走2天14小时49分06秒后的时间是多少。

 */
public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        // 目标：学会使用SimpleDateFormat解析字符串时间成为日期对象。
        // 1. 把一个字符串拿到程序中来
        String dateStr = "2021年08月06日11点11分11秒";

        // 2. 把字符口中时间解析成日期对象（本节的重点）：形式必须与被解析时间的形式完成一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
        Date date = sdf.parse(dateStr);

        // 3. 往后走2天14小时49分06秒
        Date date1 = date + (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;

        // 4. 格式化这个时间毫秒值就是结果


    }
}
