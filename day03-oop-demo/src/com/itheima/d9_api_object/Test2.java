package com.itheima.d9_api_object;

import java.util.Objects;

/**
    目标：掌握Object类中equals方法的使用。
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("周雄", '男', 19);
        Student s2 = new Student("周雄", '男', 19);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(Objects.equals(s1, s2));
    }
}
