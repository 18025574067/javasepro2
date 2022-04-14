package com.itheima.d1_static;

public class User {
    /**
     * 在线人数。
     * 注意：static修饰的成员变量：静态成员变量，在内存中只有一份，所有人共享。
     */
    public static int onlineNumber = 161;

    /**
     * 实例成员变量，无static修饰，属于每个对象的，使用对象名.访问。
     */
    private String name;
    private int age;

    public static void main(String[] args) {
        // 目标：理解static修饰成员变量的作用和访问特点。
        // 访问：类名.静态成员变量
        System.out.println(User.onlineNumber);

        // 对象名.静态成员变量
        // 官方不推荐
        // 2. 对象名.实例成员变量
//        System.out.println(User.name); // 报错
        User u = new User();
        u.name = "张三";
        u.age = 23;
        System.out.println(u.name);
        System.out.println(u.age);
        u.onlineNumber++; // 新来了一个人。
        System.out.println(u.onlineNumber);

        System.out.println(u.onlineNumber);
        System.out.println(User.onlineNumber); // 推荐方法
        System.out.println(onlineNumber); // 注意：同一个类中访问静态成员变量可以省略类名。
    }

}
