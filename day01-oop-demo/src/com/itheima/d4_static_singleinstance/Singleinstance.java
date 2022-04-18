package com.itheima.d4_static_singleinstance;

/**
    使用饿汉单例实现单例类
 */
public class Singleinstance {

    /**
        2. 饿汉单例是在获取对象前，对象已经提前准备好了一个。
     */
    public static Singleinstance instance = new Singleinstance();
//    public static int age = 21;
    /**
        1. 必须把构造器私有化
     */
    private Singleinstance(){};
}
