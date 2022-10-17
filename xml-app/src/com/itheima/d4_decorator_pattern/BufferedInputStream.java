package com.itheima.d4_decorator_pattern;

public class BufferedInputStream extends InputStream{
    private InputStream is;
    public BufferedInputStream(InputStream is){
        this.is = is;
    }

    @Override
    public int read() {
        System.out.println("提供8kb的缓冲区，提高读数据功能。。。");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8kb的缓冲区，提高读数据功能。。。");
        return is.read(buffer);
    }
}