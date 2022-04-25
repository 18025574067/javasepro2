package com.itheima.d11_extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 目标：学习子类构造器如何去访问父类的有参构造器，还要清楚其作用。
        Teacher t = new Teacher("地雷", 18);
//        t.setName("地雷");
//        t.setAge(18);
        System.out.println(t.getName());
        System.out.println(t.getAge());

    }
}
