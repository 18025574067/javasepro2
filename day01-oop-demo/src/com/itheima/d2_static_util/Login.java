package com.itheima.d2_static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        // 开发一个验证码
        System.out.println("验证码：" + ItheimaUtil.createVerifyCode(6));
    }
}
