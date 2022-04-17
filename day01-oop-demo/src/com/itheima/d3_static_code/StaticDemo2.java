package com.itheima.d3_static_code;

public class StaticDemo2 {

    public String name;

    public StaticDemo2(){
        System.out.println("++++++无参构造器被触发++++++++");
    }

    /**
        实例代码块：无static修饰，属于对象，
        初始化实例资源，几乎不用。
     */
    {
//        name = "张三";
        System.out.println("+++++++++++++实例代码块被触发执行++++++++++++++");
    }

    public static void main(String[] args) {
        // 目标：理解实例代码块，也叫构造代码块。
        StaticDemo2 s1 = new StaticDemo2();
        System.out.println(s1.name);
        System.out.println();
        StaticDemo2 s2 = new StaticDemo2();
        System.out.println(s1.name);



    }
}
