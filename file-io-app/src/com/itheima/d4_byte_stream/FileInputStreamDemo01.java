package com.itheima.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
    -- 构造器
            public FileInputStream(File file): 创建字节输入流管道与源文件对象接通
            public FileInputStream(String pathname)：创建字节输入流管道与源文件路径接通。

    -- 方法：
            public int read()：每次读取一个字节返回，读取完毕返回-1

    小结：
            一个一个字节读取中文数据输出其实是补淘汰的，性能极差！
            一个一个字节读取中文数据输出，会出现截断中文字节的情况，无法避免读取中文输出乱码的问题。

 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 创建一个文件字节输入流管道连接到源文件接通
//        InputStream is = new FileInputStream(new File("file-io-app/src/data.txt"));
        InputStream is = new FileInputStream("file-io-app/src/data.txt"); // 简化写法。

        // 2.

    }
}
