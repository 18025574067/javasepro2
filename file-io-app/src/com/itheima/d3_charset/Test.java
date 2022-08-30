package com.itheima.d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
    目标：学会自己对文字进行编码和解码，为以为可能用到的场景做准备。
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1. 编码：把文字转换为字节（使用指定的编码）
        String name = "abc我爱你中国";
//        byte[] bytes = name.getBytes(); // 以当前默认的字符集进行编码（UTF-8）。
        byte[] bytes = name.getBytes("GBK"); // 指定编码（GBK）。
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);
    }
}
