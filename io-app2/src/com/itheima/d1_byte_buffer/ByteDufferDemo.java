package com.itheima.d1_byte_buffer;

import java.io.*;

/**
    目标：使用字节缓冲流完成数据的读写操作。
 */
public class ByteDufferDemo {

    public static void main(String[] args) throws Exception {
        try (
                // 这里只能放资源对象，用完会自动关闭，自动调用close方法关闭资源（即使出现异常也会做关闭操作）
                // 1. 创建一个字节输入流与源文件连接
                InputStream is = new FileInputStream("/home/hyb/图片/Wallpapers/1eff40a7089bd56f718044113ef0f160.jpg");
                // a. 把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);
                // 2. 创建一个字节输出流与目标文件连接
                OutputStream os = new FileOutputStream("io-app2/src/1.jpg");
                // b. 把字节输出流包装成高级的缓冲字节输出流管道。
                OutputStream bos = new BufferedOutputStream(os);
        ){
            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的数据长度。
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
