package com.itheima.d8_commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
    步骤：
        1. 下载commons-io相关jar包：http://commons.apache.org/proper/commons-io/
        2. 把commons-io-2.6.jar包复制到指定的Module的lib目录中
        3. 将commons-io-2.6.jar加入到classpath中

    小结：
        IOUtils和FileUtils可以方便的复制文件和文件夹！！
 */

public class CommonsIODemo01 {
    public static void main(String[] args) throws IOException {
        // 1. 完成文件复制：
        // IOUtils.copy(new FileInputStream("/home/hyb/图片/Wallpapers/02bee8d2b5165f951148464461086692.jpg"), new FileOutputStream("io-app2/src/new.jpg"));

        // 2. 完成文件复制到某个文件夹下：
        // FileUtils.copyFileToDirectory(new File("/home/hyb/图片/Wallpapers/02bee8d2b5165f951148464461086692.jpg"), new File("io-app2/src/aa/"));

        // 3. 完成文件夹复制到某个文件夹下：
//         FileUtils.copyDirectoryToDirectory(new File("io-app2/src/aa"), new File("io-app2/src/bb"));

//        FileUtils.deleteDirectory(new File("io-app2/src/bb"));

        // JDK1.7自己也做了一些一行代码完成复制的操作：New IO的技术
//        Files.copy(Path.of("io-app2/src/new.jpg"), Path.of("io-app2/src/newJpg.jpg"));

        Files.deleteIfExists(Path.of("io-app2/src/aa"));
    }
}
