package com.itheima.d9_abstract_template;

public class Test {
    public static void main(String[] args) {
        // 目标：理解模板方法模式的思想和使用方法。
        StudentModdle s = new StudentModdle();
        s.write();

        StudentChild s1 = new StudentChild();
        s1.write();

    }
}
