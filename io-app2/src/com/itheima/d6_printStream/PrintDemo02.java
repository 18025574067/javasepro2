package com.itheima.d6_printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
    目标：学会使用打印流，高效 方便写数据到文件。
 */

public class PrintDemo02 {
    public static void main(String[] args) throws Exception {
        // 创建一个打印流对象
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");

        // 改变输出语句的位置（重定向）
        PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/log.txt")); // 追加数据，在低级管道后面加true.
        System.setOut(ps);
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");
        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
    }
}
