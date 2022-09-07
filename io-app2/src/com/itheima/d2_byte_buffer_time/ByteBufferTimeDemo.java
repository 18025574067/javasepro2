package com.itheima.d2_byte_buffer_time;

import java.io.*;

/**
        (1)使用低级的字节流按照一个一个字节的形式复制文件
        (2)使用低级的字节流按照一个一个字节数组的形式复制文件。
        (3)使用高级的缓冲字节流按照一个一个字节的形式复制文件。
        (4)使用高级的缓冲字节流按照一个一个字节数组的形式复制文件。

    源文件： C:\course\3-视频\18、IO流-文件字节输出流FileOutputStream写字节数据出去.avi
    目标文件：C:\course\

    小结：
        使用高级的缓冲字节流按照一个一个字节数组的形式复制文件、性能好、建议开发使用！

 */
public class ByteBufferTimeDemo {
//    private static final String SRC_FILE = "E:\\MP3_1\\彭筝-太想念.mp3";
    private static final String SRC_FILE = "io-app2/src/相位仪.mp3";
//    private static final String DEST_FILE = "D:\\";
    private static final String DEST_FILE = "io-app2/src/";

    public static void main(String[] args) {
//         copy01(); // 使用低级的字节流按照一个一个字节的形式复制文件，慢得让人简直无法忍受，直接被淘汰。56.126s
        copy02(); // 使用低级的字节流按照一个一个字节数组的形式复制文件，比较慢，但是还是可以忍受的。0.078s
//        copy03(); // 缓冲流一个一个字节复制，很慢，不建议使用。55.515s
        copy04(); // 缓冲流一个一个字节数组复制，飞快，简单太完美了。0.095s

    }

    private static void copy04() {
        long startTime = System.currentTimeMillis();
        try (
                // 1. 创建一个字节输入流与源文件连接
                InputStream is = new FileInputStream(SRC_FILE);
                // a. 把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);
                // 2. 创建一个字节输出流与目标文件连接
                OutputStream os = new FileOutputStream(DEST_FILE +  "a4.mp3");
                // b. 把字节输出流包装成高级的缓冲字节输出流管道。
                OutputStream bos = new BufferedOutputStream(os);
        ){
            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的数据长度。
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用缓冲字节流按照一个一个字节数组的形式复制文件耗时：" + (endTime-startTime)/1000.0 + "s");
    }

    private static void copy03() {
        long startTime = System.currentTimeMillis();
        try (
            // 1. 创建一个字节输入流与源文件连接
            InputStream is = new FileInputStream(SRC_FILE);
            // a. 把原始的字节输入流包装成高级的缓冲字节输入流
            InputStream bis = new BufferedInputStream(is);
            // 2. 创建一个字节输出流与目标文件连接
            OutputStream os = new FileOutputStream(DEST_FILE +  "a3.mp3");
            // b. 把字节输出流包装成高级的缓冲字节输出流管道。
            OutputStream bos = new BufferedOutputStream(os);
            ){
            // 3. 定义一个变量记录每次读取的字节（一个一个字节的读写）
            int b;
            while ((b =is.read()) != -1){
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用缓冲字节流按照一个一个字节的形式复制文件耗时：" + (endTime-startTime)/1000.0 + "s");
    }

    private static void copy02() {
        long startTime = System.currentTimeMillis();
        try (
            // 这里只能放资源对象，用完会自动关闭，自动调用close方法关闭资源（即使出现异常也会做关闭操作）
            // 1. 创建一个字节输入流与源文件连接
            InputStream is = new FileInputStream(SRC_FILE);
            // 2. 创建一个字节输出流与目标文件连接
            OutputStream os = new FileOutputStream(DEST_FILE + "a2.mp3");
             ){
            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的数据长度。
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节数组的形式复制文件耗时：" + (endTime-startTime)/1000.0 + "s");
    }

    private static void copy01(){
        long startTime = System.currentTimeMillis();
        try(
            // 1. 使用原始的字节输入流连接源文件
            InputStream is = new FileInputStream(SRC_FILE);
            // 2. 使用原始字节输出流连接目标文件
            OutputStream os = new FileOutputStream(DEST_FILE + "a1.mp3");
        ){
            // 3. 定义一个变量记录每次读取的字节（一个一个字节的读写）
            int b;
            while ((b =is.read()) != -1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件耗时：" + (endTime-startTime)/1000.0 + "s");
    }
}