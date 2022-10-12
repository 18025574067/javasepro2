package com.itheima.d10_proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    /** 通过一个静态方法，为用户业务对象返回一个代理对象  */
//    public static UserService getProxy(UserService obj){
    public static <T> T getProxy(T obj){
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long startTime = System.currentTimeMillis();
                        // 真正触发对象的行为执行
                        Object rs = method.invoke(obj, args);
                        long endTime = System.currentTimeMillis();
                        System.out.println(method.getName() + "方法耗时：" + (endTime - startTime)/1000.0  + "s");
                        return rs;
                    }
                });
    }
}
