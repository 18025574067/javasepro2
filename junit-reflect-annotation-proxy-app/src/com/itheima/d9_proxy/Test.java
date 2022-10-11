package com.itheima.d9_proxy;

public class Test {
    public static void main(String[] args) {
        // 目标：学习开发出一个动态代理的对象出来，理解动态代理的执行流程
        Star s = new Star("杨超越");

        // 为杨超越对象，生成一个代理对象（代理人）
        Skill s2 = StarAgentProxy.getProxy(s);
        s2.jump();
//        s2.sing();
        
    
    }


}
