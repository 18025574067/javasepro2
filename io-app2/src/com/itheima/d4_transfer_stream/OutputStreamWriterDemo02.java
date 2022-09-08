package com.itheima.d4_transfer_stream;

import java.io.*;

public class OutputStreamWriterDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. 定义一个字节输出流
        OutputStream os = new FileOutputStream("io-app2/src/out03.txt");

        // 2. 把原始的字节输出流包装成字符输出流
//        Writer osw = new OutputStreamWriter(os); // 以默认的UTF-8写字符出去，跟直接写FileWriter一样。
        Writer osw = new OutputStreamWriter(os, "GBK"); // 以指定GBK编码输出。

        // 3. 把低级的字符输出流包装成高级的缓冲输出流提高性能。
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("我爱你中国1～～～～");
        bw.write("我爱你中国2～～～～");
        bw.write("我爱你中国3～～～～");
        bw.write("我爱你中国4～～～～");
        bw.newLine();



        bw.close();

    }
}
