package com.itheima.d1_package;

// 导包
import com.itheima.d1_package.it.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标： 理解以下两点
        // 1. 理解同一个包的类，互相可以直接调用。
        System.out.println(User.onlineNumber);

        // 2. 不同包下的类，需要先导包才可以访问。
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        // 3. 如果这个类使用不同包下的同名类名，默认只能导入一个类的包，另外一个类要使用全名访问。
        com.itheima.d1_package.it2.Student s2 = new com.itheima.d1_package.it2.Student();



    }
}
