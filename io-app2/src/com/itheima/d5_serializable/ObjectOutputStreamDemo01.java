package com.itheima.d5_serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
    目标：对象序列化，使用 ObjectOutputStream把内存中的对象存入到磁盘文件中。
 */
public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1. 创建学生对象
        Student s = new Student("陈磊", "chanlei", "1314520", 20);

        // 2. 对象序列化，使用对象输出流包装低级的字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-app2/src/obj.txt"));

        // 3. 直接序列化对象
        oos.writeObject(s);

        // 4. 释放资源
        oos.close();

        System.out.println("序列化成功。");
    }
}
