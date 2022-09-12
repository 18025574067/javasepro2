package com.itheima.d6_printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
    目标：学会使用打印流，高效 方便写数据到文件。
 */

public class PrintDemo02 {
    public static void main(String[] args) throws Exception {
        // 创建一个打印流对象
        PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/1.txt", true)); // 追加数据，在低级管道后面加true.

    }
}
