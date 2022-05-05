package com.itheima.d2_static_util;

import java.util.Random;

/**
    工具类
 */
// final 修饰的类不能被继承。
public final class ItheimaUtil {

    /**
        由于工具类无需创建对象，所以其构造器私有化会显得比较专业！
     */
    private ItheimaUtil(){
    }
    /**
        静态方法
     */
    public static String createVerifyCode(int n){
        // 开发一个验证码
        // 1. 定义一个变量记住验证码
        String code = "";

        // 2. 定义一个变量存储全部验证码字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 3. 定义一个循环生成几个随机索引，去得到几个字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            // 4. 获取随机索引对应的字符
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }

        return code;
    }
}
