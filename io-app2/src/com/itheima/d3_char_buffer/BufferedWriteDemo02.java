package com.itheima.d3_char_buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
    目标：缓冲输出流的使用，学会它多出来的一个功能：newLine.
 */
public class BufferedWriteDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个字符输出流管道与目标文件接通
        // Writer fw = new FileWriter("file-io-app/src/data6.txt") // 覆盖管道
        Writer fw = new FileWriter("io-app2/src/data6.txt", true); // 追加管道。

        BufferedWriter bw = new BufferedWriter(fw);

        // a. public void writer(int c): 写一个字符出去
        bw.write(97); // a
        bw.write('A'); //
        bw.write('磊'); // 无问题，真的是一个字符看待的。
        bw.write("\r\n"); // 换行

        // b. public void write(String c) 写一个字符串出去
        bw.write("我爱你中国abc");
        bw.write("我爱你中国abc2");
        bw.write("\r\n"); //换行

        // c. public void write(char[] buffer): 写一个字符数据出去
        char[] buffer1 = "此情可成追忆，只是当时己懵逼".toCharArray();
        bw.write(buffer1);
        bw.write("\r\n"); //换行

        // d. public void write(String c, int pos, int len):写字符串的一部分出去
        bw.write("abc我是中国人", 0, 3);
        bw.write("\r\n"); //换行


        // e. public void write(char[] buffer, int pos, int len):写字符数组的一部分出去
        bw.write(buffer1, 5, 8);
        bw.write("\r\n"); //换行
        bw.newLine();
        bw.newLine();
        bw.newLine();


//        fw.flush(); // 刷新后可以继续写入。
        bw.close(); // 关闭包含刷新，但关闭后流不能操作

    }
}
