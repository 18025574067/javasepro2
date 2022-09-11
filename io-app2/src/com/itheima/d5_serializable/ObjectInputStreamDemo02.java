package com.itheima.d5_serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
    目标：学会对象反序列化，使用对象输入流把文件中的对象数据恢复成内存中的JAVA对象。

    对象如果要序列化，必须Serializable序列化接口。
    序列化的版本与反序列化的版本必须是一致，否则会报错。
 */
public class ObjectInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. 创建对象字节输入流管道包装低级的字节输入流管道
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io-app2/src/obj.txt"));

        // 2. 调用对象字节输入流序列化方法得到对象
        Student s = (Student) ois.readObject();

        System.out.println(s);
    }
}
