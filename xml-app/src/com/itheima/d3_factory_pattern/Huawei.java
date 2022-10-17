package com.itheima.d3_factory_pattern;

public class Huawei extends Computer {
    @Override
    public void start(){
        System.out.println(getName() + "开机了，并展示了华为的菊花Logo");
    }
}
