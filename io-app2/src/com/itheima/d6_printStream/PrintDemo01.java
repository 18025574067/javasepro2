package com.itheima.d6_printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
    目标：学会使用打印流，高效 方便写数据到文件。
 */

public class PrintDemo01 {
    public static void main(String[] args) throws Exception {
        //
        PrintStream ps = new PrintStream("io-app2/src/1.txt", "GBK");
        PrintWriter pw = new PrintWriter("io-app2/src/1.txt", "GBK"); // 打印功能上与PrintStream没区别。
        ps.println("aaa");
        ps.println(21);
        ps.println('a');
        ps.println(23.56);
        ps.println(true);
        ps.println("我是打印流，输入啥就输出啥。");

        ps.close();
    }
}
