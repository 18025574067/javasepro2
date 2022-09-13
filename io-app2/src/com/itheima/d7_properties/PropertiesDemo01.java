package com.itheima.d7_properties;

import java.io.FileWriter;
import java.util.Properties;

/**
    目标：使用Properties把键值对存入到属性文件中去。
 */
public class PropertiesDemo01 {
    public static void main(String[] args) throws Exception{
        // 使用Properties把键值对存入到属性文件中去。
        Properties properties = new Properties();
        properties.setProperty("admin", "112345");
        properties.setProperty("xulei", "003175");
        properties.setProperty("heima", "itcast");
        System.out.println(properties);


        /**
            参数一：保存管道，字符输出流管道
            参数二：保存心得。
         */
        properties.store(new FileWriter("io-app2/src/user.properties"),
                "this is users, i am very happy! give me 100!");
    }

}
