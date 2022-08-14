package com.itheima.d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    方式一：
        在出现编译时异常的地方层层把异常抛出去给调用者，调用者最终抛出给JVM虚拟机。
        JVM虚拟机输出异常信息，直接干掉程序，这种方式与默认方式是一样的。
        虽然可以解决代码编译时的错误，但是一旦运行时真的出现异常，程序还是会立即死亡！
        这种方式并不好！
    小结：
        方式一出现异常层层抛出给虚拟机，最终程序如果真的出现异常，程序还是立即死亡！这种方式并不好。
 */
public class ExceptionDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("程序开始。。。");
        parseTime("2011-1-22 12:30:30");
        System.out.println("程序结束。。。");
    }
    public static void parseTime(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("E:/meinv.jpg");
    }
}
