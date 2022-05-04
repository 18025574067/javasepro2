package com.itheima.d2_modifier.itcast;

import com.itheima.d2_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        // 不同包下的子类。

        // 父类
        Fu f = new Fu();
//        f.privateMethod();
//        f.method();
//        f.protectedMethod();
        f.publicMethod();

        // 子类
        Zi z = new Zi();
        z.protectedMethod();
        z.publicMethod();
    }

}
