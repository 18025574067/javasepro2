package com.itheima.d2_recursion;

import java.io.File;
import java.io.IOException;

/**
    目标：去/home/目录 下找到/home/hyb/文档/DR.exe文件。
        /opt/kingsoft/wps-office/office6/wps
 */
public class RecursionDemo05 {
    public static void main(String[] args) {
        // 2. 传入目录和文件名
//        searchFile(new File("/home/hyb/音乐"), "安和桥");
//        searchFile(new File("/opt/kingsoft/"), "wps");
        searchFile(new File("C:\\Users\\hyb\\Documents\\javasepromax"), "Movie.java");
    }

    /**
        1. 搜索某个目录下的所有文件，找到我们想要的文件
     * @param dir 被搜索的源路径
     * @param fileName  要搜索的文件名。
     */
    public static void searchFile(File dir, String fileName){
        // 3. 判断dir是否是文件夹
        if (dir != null && dir.isDirectory()){
            // 可以找了
            // 4. 提取当前目录下的一级文件对象、
            File[] files = dir.listFiles();
            // 5. 判断是否存在一级文件对象，存在才可以遍历
            if (files != null && files.length > 0) {
                for (File file : files) {
                    // 6. 判断当前遍历的一级文件对象是文件还是文件夹
                    if (file.isFile()) {
                        // 7. 是不是要找的，是则返回路径即可
                        if (file.getName().contains(fileName)){
                            System.out.println("找到了：" + file.getAbsolutePath());
                            // 启动它，只能启动软件。
//                            Runtime r = Runtime.getRuntime();
//                            try {
//                                r.exec(file.getAbsolutePath());
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
                            }
                        } else {
                        // 8. 是文件夹，需要继续递归查找。
                        searchFile(file, fileName);
                    }
                }
            }
        }else {
            System.out.println("对不起，当前搜索的位置不是文件夹！");
        }
    }
}
