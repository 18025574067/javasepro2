package com.itheima.d9_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
    /**
        设计一个方法来返回一个明星对象的代理对象
     */
    public static Skill getProxy(Star obj){
        // 为杨超越这个对象，生成一个代理对象。
        /**
        public static Object newProxyInstance(ClassLoader loader, 
            Class<?>[] interfaces, 对象实现的接口列表
            InvocationHandler h)
         */
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
    
    }









}
