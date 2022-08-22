package com.itheima.d1_file;

import java.io.File;

/**
    目标：学会使用File对象定位操作系统的文件对象（文件和文件夹）

 */
public class FileDemo {
    public static void main(String[] args) {
        // 1. 创建文件对象
        File file = new File("/home/hyb/文档/code/beauty.jpeg");
        System.out.println(file.length());
    }
}
