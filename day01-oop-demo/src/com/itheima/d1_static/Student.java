package com.itheima.d1_static;

public class Student {
    /**
        实例成员变量：无static修饰，属于对象。
     */
    private String name;

    /**
        静态成员方法：有static修饰，归属于类，可以被共享访问，用类和对象名都可以访问
     */
    public static int getMax(int age1, int age2){
        return age1 > age2? age1: age2;
    }

    /**
        实例方法：属于对象，只能在对象中触发访问。
     */
    public void study(){
        System.out.println(name + "在好好学习，天天向上！");
    }


    public static void main(String[] args) {
        // 1. 类名.静态成员方法
        System.out.println(Student.getMax(3, 23));

        // 注意：同一个类中，访问静态方法，类名可以省略不写
        System.out.println(getMax(33, 34));

//        study(); // 报错

        Student s = new Student();
        s.name = "小明";
        s.study();
    }

}
