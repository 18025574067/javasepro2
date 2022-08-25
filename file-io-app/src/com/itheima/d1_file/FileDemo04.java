package com.itheima.d1_file;

import java.io.File;
import java.util.Arrays;

/**
    目标：File针对目录的遍历
    -public String[] list():
        获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
    -public File[] listFiles()(常用)
        获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
 */
public class FileDemo04 {
    public static void main(String[] args) {
        // 1. 定位一个目录
        File f1 = new File("/home/hyb/文档/code/file");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 2. 一级文件对象
        // 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        // 注意事项 空文件返回null.
//        File file = new File("/home/aaaaaaaaaaaaaaaaa"); // 不存在返回 null
//        File file = new File("/home/hyb/文档/code/file/aa"); // 如果不是目录，是文件，返回null.
        File file = new File("/home/hyb/文档/code/file/aaa/bnv/ewger/serges"); // 如果是空文件夹，返回长度为0的数组。
        String[] list = file.list();
//        System.out.println(list);
        System.out.println(Arrays.toString(list));
    }
}
