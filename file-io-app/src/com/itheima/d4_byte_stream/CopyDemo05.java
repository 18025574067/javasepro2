package com.itheima.d4_byte_stream;

import java.io.*;

/**
    目标：学会使用字节流完成文件的复制（支持一切文件类型的数据）。
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        try {
            // 1. 创建一个字节输入流与源文件连接
//            InputStream is = new FileInputStream("/home/hyb/视频/A(视频） 流行抖音MV (50部）/040 李玉刚-新贵妃醉酒.mp4");
            InputStream is = new FileInputStream("E:\\A(视频） 流行抖音MV (50部）\\007 越南版-兄弟想你了 .mp4");

            // 2. 创建一个字节输出流与目标文件连接
//            OutputStream os = new FileOutputStream("/home/hyb/桌面/1.mp4");
            OutputStream os = new FileOutputStream("C:\\Users\\AA\\Desktop\\1.mp4");

            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的数据长度。
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }

            // 关闭资源。
            os.close();
            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
