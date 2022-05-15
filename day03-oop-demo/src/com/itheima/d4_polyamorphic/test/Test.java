package com.itheima.d4_polyamorphic.test;

/**
    目标：USB设备模拟
    1. 定义USB接口：接入，拔出
    2. 定义2个USB的实现类：鼠标，键盘。
    3. 创建一个电脑对象，创建USB设备对象，安装启动。
 */
public class Test {
    public static void main(String[] args) {
        // a. 创建电脑对象
        Computer c = new Computer("外星人");
        c.start();
        System.out.println("-------------------");

        // b. 创建鼠标对象，键盘对象
        USB u = new Mouse("双飞燕");
        c.installUSB(u);
        System.out.println("=========================");
        USB u2 = new KeyBoard("罗技");
        c.installUSB(u2);

    }
}
