package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
    目标：使用文件字节流每次读取一个字节数组的数据。
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个文件字节流管道连接到文件。
        InputStream is = new FileInputStream("file-io-app/src/data1.txt");
        // 2. 定义一个字节数组，用于读取字节数组。
//        byte[] buffer = new byte[3];  // 1KB.
//
//        int len = is.read(buffer);
//        System.out.println("读取了几个字节：" + len);
//        String rs = new String(buffer);
//        System.out.println(rs);
//
//        int len1 = is.read(buffer);
//        System.out.println("读取了几个字节：" + len1);
//        String rs1 = new String(buffer);
//        System.out.println(rs1);
//        // buffer = [1fd]
//
//        // buffer = [1fd] => [ded]
//        int len2 = is.read(buffer);
//        System.out.println("读取了几个字节：" + len2);
//        String rs2 = new String(buffer, 0, len2);
//        System.out.println(rs2);
//
//        int len3 = is.read(buffer);
//        System.out.println("读取了几个字节：" + len3);

        // 3. 改进使用循环，每次读取一个字节数组
        byte[] butter = new byte[3];
        int len;
//        while ((len = is.read()) > 0){
        while ((len = is.read(butter)) != -1){
            System.out.print(new String(butter, 0, len));
        }

    }
}
