package com.itheima.d6_abstract;

/**
    抽象类：有abstract修饰。
 */
public abstract class Animal {
    private String name;

    /**
        抽象方法：有abstract修饰，只有方法签名，不能写方法体代码！
     */
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
