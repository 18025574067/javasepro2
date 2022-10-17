package com.itheima.d4_decorator_pattern;

/**
    原始类。
 */
public class FileInputStream extends InputStream{
    @Override
    public int read() {
        System.out.println("低性能的方式，读取了一个字符a");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        return 0;
    }
}