package com.itheima.d3_factory_pattern;

public class Mac extends Computer{
    @Override
    public void start() {
        System.out.println(getName() + "以优雅的方式开机，并展示了一个苹果logo");
    }
}
