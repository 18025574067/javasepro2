package com.itheima.d3_factory_pattern;

public class FactoryPattern {
    /**
        定义一个方法，创建对象返回。
     */
    public static Computer createComputer(String info){
        switch (info) {
            case "huawei" -> {
                Computer c = new Huawei();
                c.setName("huawei pro 16");
                c.setPrice(5999);
                return c;
            }
            case "mac" -> {
                Computer c1 = new Huawei();
                c1.setName("MacBook pro");
                c1.setPrice(11999);
                return c1;
            }
        }
        return null;
    }
}
