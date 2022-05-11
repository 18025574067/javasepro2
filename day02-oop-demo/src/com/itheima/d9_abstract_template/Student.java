package com.itheima.d9_abstract_template;

public abstract class Student {

    /**
        正式：声明了模板方法模式
     */
    public void write(){
        System.out.println("\t\t\t我的爸爸");
        System.out.println("您的爸爸怎么样，一起来说说：");

        // 正文部分:每个子类都要写，每个子类情况不一样，
        // 因此定义了模板方法模式，具体交给子类去处理。
        System.out.println(writeMain());

        System.out.println("我的爸爸真是太好了！");
    }
    public abstract String writeMain();
}
