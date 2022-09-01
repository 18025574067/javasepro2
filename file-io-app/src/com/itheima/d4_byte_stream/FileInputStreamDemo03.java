package com.itheima.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
    目标：使用文件字节流一次性读取完全部数据，避免乱码。
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个文件字节流管道连接到文件。
        File f = new File("file-io-app/src/data2.txt");
        InputStream is = new FileInputStream(f);

        // 2. 定义一个字节数组刚好与文件大小一样大。
        byte[] butter = new byte[(int) f.length()];
        int len = is.read(butter);
        System.out.println("读取了几个字节：" + len);
        System.out.println("文件的大小：" + f.length());
        System.out.println(new String(butter));


    }
}
