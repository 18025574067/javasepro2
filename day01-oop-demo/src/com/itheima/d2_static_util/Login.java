package com.itheima.d2_static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        // 开发一个验证码
        // 1. 定义一个变量记住验证码
        String code = "";

        // 2. 定义一个变量存储全部验证码字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 3. 定义一个循环生成几个随机索引，去得到几个字符
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            // 4. 获取随机索引对应的字符
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }

        System.out.println(code);
    }
}
