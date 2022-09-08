package com.itheima.d4_transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
    目标：演示一个代码编码与文件编码一样与不同的情况。
 */
public class CharSetTest00 {
    public static void main(String[] args) {
        try(
            // 代码：UTF-8与文件：UTF-8不会乱码
            // 1. 创建一个文件字符输入流与源文件相连
//            Reader fr = new FileReader("io-app2/src/newCsb.txt");

            // 代码：UTF-8与文件：GBK，会乱码。
            Reader fr = new FileReader("io-app2/src/csb.txt");

            // a. 把低级的字符输入流转换成高级的缓冲字符输入流
            BufferedReader br = new BufferedReader(fr);
        ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
