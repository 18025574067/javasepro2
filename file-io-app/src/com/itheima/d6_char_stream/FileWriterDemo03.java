package com.itheima.d6_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
    fw.write("\r\n"); // 换行
    结论：读写字符文件数据建议使用字符流，复制文件建议使用字节流。
 */
public class FileWriterDemo03 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个字符输出流管道与目标文件接通
        // Writer fw = new FileWriter("file-io-app/src/data6.txt") // 覆盖管道
        Writer fw = new FileWriter("file-io-app/src/data6.txt", true); // 追加管道。

        // a. public void writer(int c): 写一个字符出去
        fw.write(97); // a
        fw.write('A'); //
        fw.write('磊'); // 无问题，真的是一个字符看待的。
        fw.write("\r\n"); // 换行

        // b. public void write(String c) 写一个字符串出去
        fw.write("我爱你中国abc");
        fw.write("我爱你中国abc2");
        fw.write("\r\n"); //换行

        // c. public void write(char[] buffer): 写一个字符数据出去
        char[] buffer1 = "此情可成追忆，只是当时己懵逼".toCharArray();
        fw.write(buffer1);
        fw.write("\r\n"); //换行

        // d. public void write(String c, int pos, int len):写字符串的一部分出去
        fw.write("abc我是中国人", 0, 3);
        fw.write("\r\n"); //换行


        // e. public void write(char[] buffer, int pos, int len):写字符数组的一部分出去
        fw.write(buffer1, 5, 8);

//        fw.flush(); // 刷新后可以继续写入。
        fw.close(); // 关闭包含刷新，但关闭后流不能操作

    }
}
