package com.itheima.d13_interface_jdk8;

public interface SportManInter {
    /**
        1. JDK8开始，默认方法（实例方法）
        -- 必须由 default 修饰，默认用 public 修饰。
        默认方法，接口不能创建对象，这个方法只能过继给实现类，由实现类的对象调用。
     */
    public default void run(){
        System.out.println("跑得很快~~~~");
    }
}

class PingPongMan implements SportManInter{}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
    }
}