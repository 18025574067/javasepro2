package com.itheima.d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
    目标：学会使用缓冲字符输入流提高字符输入流的性能，新增了按照行读取的方法(经典代码)
 */
public class BufferedReaderDemo01 {
    public static void main(String[] args) {
        try (
                // 1. 创建一个字符输入流
                Reader fr = new FileReader("io-app2/src/data1.txt");
                // 把低级的字符输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
                ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());


//            // 2. 用循环，每次读取一个字符数组的数据
//            char[] buffer = new char[1024]; // 1024个字符。
//            int len;
//            while ((len = br.read(buffer)) != -1){
//                String rs = new String(buffer, 0, len);
//                System.out.print(rs);
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
