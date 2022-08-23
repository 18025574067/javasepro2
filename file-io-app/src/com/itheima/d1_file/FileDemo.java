package com.itheima.d1_file;

import java.io.File;

/**
    目标：学会使用File对象定位操作系统的文件对象（文件和文件夹）

 */
public class FileDemo {
    public static void main(String[] args) {
        // 1. 创建文件对象
        // 路径写法：
        // File file = new File("D:\\code\\beauty.jpeg"); windows
//        File file = new File("/home/hyb/文档/code/beauty.jpeg");
        // File.separator 可以跨平台。
        File file = new File( File.separator + "home" + File.separator + "hyb" +File.separator
                + "文档" + File.separator + "code" + File.separator + "beauty.jpeg");
        long size = file.length(); // 是文件的字节大小。
        System.out.println(size);

        // 2. File创建对象，支持绝对路径，支持相对路径（重点）
        File f1 = new File("/home/hyb/文档/code/hushui.jpeg"); // 绝对路径
        System.out.println(f1.length());

        // 相对路径，一般定位在模块中，相对到工程下。
        File f2 = new File("file-io-app/src/data.txt");
        System.out.println(f2.length());

        // 3. File创建对象，可以是文件，也可以是文件夹。
//        File f3 = new File("file-io-app/src");
        File f3 = new File("/home/hyb/文档/code");
        System.out.println(f3.length());
        System.out.println(f3.exists()); // 判断路径是否存在。


    }
}
