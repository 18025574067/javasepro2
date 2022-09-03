package com.itheima.d5_resource;

import java.io.*;

/**
    目标：学会使用finally释放资源。
 */
public class TryCatchFinallyDemo01 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
//            System.out.println(10/0);

            // 1. 创建一个字节输入流与源文件连接
//             is = new FileInputStream("/home/hyb/视频/A(视频） 流行抖音MV (50部）/040 李玉刚-新贵妃醉酒.mp4");
             is = new FileInputStream("/home/hyb/文档/madia/Track03.mp3");
//            InputStream is = new FileInputStream("E:\\A(视频） 流行抖音MV (50部）\\007 越南版-兄弟想你了 .mp4");

            // 2. 创建一个字节输出流与目标文件连接
//            os = new FileOutputStream("/home/hyb/桌面/1.mp4");
            os = new FileOutputStream("/home/hyb/桌面/1.mp3");
//            OutputStream os = new FileOutputStream("C:\\Users\\AA\\Desktop\\1.mp4");

            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的数据长度。
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");
//            System.out.println(10/0);



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 无论代码是否正常结束，还是出现异常都要最后执行这里。
            System.out.println("============finally=============");

            // 关闭资源。
            try {
                if (os != null)os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null)is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(test(10, 2));
    }
    public static int test(int a, int b){
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }finally {
            // 哪怕上面有return语句，也必须先执行这里才可以
            // 开发中不建议在此加return语句，如果加了，返回的永远都是这里的数据了，这样会出问题。
            return 100;
        }
    }
}
