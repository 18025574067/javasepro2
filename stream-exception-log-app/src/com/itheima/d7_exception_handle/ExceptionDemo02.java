package com.itheima.d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    小结：
        第二种方式，可以处理异常，并且出现异常后代码也不会死亡。
        这种方案还是可以的。
        但是从理论上来说，这种方式不是最好的，上层调用者不能直接知道底层的执行情况！
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
        parseTime("2011-1-22 12:30:30");
        System.out.println("程序死亡。。。");
    }

    public static void parseTime(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);
            InputStream is = new FileInputStream("E:/meinv.jpg");

        } catch (Exception e) {
            e.printStackTrace(); // 企业级写法。
        }
    }

//    public static void parseTime(String date) {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//
//        } catch (ParseException|FileNotFoundException e) {
//            e.printStackTrace(); //打印异常栈信息。
//        }
//    }

//    public static void parseTime(String date) {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//        } catch (ParseException e) {
//            System.out.println("出现了时间解析异常，走点心！！");
//        }
//
//        try {
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException e) {
//            System.out.println("您的文件根本就没有，不要骗我哦！！");
//        }
//    }
    }
