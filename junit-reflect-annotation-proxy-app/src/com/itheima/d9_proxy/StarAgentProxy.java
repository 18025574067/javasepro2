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
        public static Object newProxyInstance(ClassLoader loader, 类加载器
            Class<?>[] interfaces, 对象实现的接口列表
            InvocationHandler h)
         */
        return (Skill) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("收首付款");
                // 真正让杨超越去唱歌和跳舞
                // method 正在调用的方法对象 args代表这个方法的参数。
                Object rs = method.invoke(obj, args);
                System.out.println("收尾款，把杨超越接回来。。。");
                return rs;
            }
        });
    
    }
}
