package com.itheima.d5_resource;

import java.io.*;

/**
    目标：JDK7释放资源的方法。
 */
public class TryCatchResourceDemo02 {
    public static void main(String[] args) throws Exception {
        try (
                // 这里只能放资源对象，用完会自动关闭，自动调用close方法关闭资源（即使出现异常也会做关闭操作）
                // 1. 创建一个字节输入流与源文件连接
                InputStream is = new FileInputStream("/home/hyb/文档/madia/Track03.mp3");
                // 2. 创建一个字节输出流与目标文件连接
                OutputStream os = new FileOutputStream("/home/hyb/桌面/1.mp3");
//                int age = 0; // 这里只能放资源。
                MyConnection connection = new MyConnection(); // 最终会自动调用close方法关闭资源。
                ){
            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的数据长度。
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class MyConnection implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("连接资源被释放。");
    }
}