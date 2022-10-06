package com.itheima.d5_reflect_method;

import org.junit.Test;

/**
    反射获取类的Method方法对象：
        1. Method getMethod(String name, Class... args);
            根据方法名和参数类型获得对应的方法对象，只能获得public的
        2. Method getDeclaredMethod(String name, Class... args);
            根据方法名和参数类型获得对应的方法对象，包括private的
        3. Method[] getMethods();
            获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的
        4. Mehtod[] getDeclaredMethods();
            获得类中的所有成员方法对象，返回数组，只获得本类申明的方法。

    Method的方法执行：
        Object invoke(Object obj, Object... args)
            参数一：触发的是哪个对象的方法执行。
            参数二： args: 调用方法时传递的实际参数。
 */
public class MethodDemo01 {
    /**
        1.获得类中的所有成员方法对象
     */
    @Test
    public void getDeclaredMethods(){
        // a. 获取类对象
        Class c = Dog.class;
        // b. 提取全部方法，包括私有的

    }

    /**
        2. 获取某个方法对象
     */
    @Test
    public void getDeclardMethod() throws Exception {
    
    }
}
