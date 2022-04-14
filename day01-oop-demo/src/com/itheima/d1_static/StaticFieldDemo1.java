package com.itheima.d1_static;

public class StaticFieldDemo1 {
    public static void main(String[] args) {
        // 目标：理解static修饰成员变量的作用和访问特点。
        // 访问：类名.静态成员变量
        System.out.println(User.onlineNumber);

        // 对象名.静态成员变量
        // 官方不推荐
        User u = new User();
        u.onlineNumber++; // 新来了一个人。
        System.out.println(u.onlineNumber);
    }

}
