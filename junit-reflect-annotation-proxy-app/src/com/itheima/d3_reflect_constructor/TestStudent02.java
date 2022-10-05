package com.itheima.d3_reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 1.newInstance(Object... instargs)
 创建对象，注入构造器需要的数据。
 2.void setAccessible(true)
 修改访问权限，true代表暴力攻破权限，false表示保留不可访问权限（暴力反射）

 小结：
 可以通过定位类的构造器对象。
 如果构造器对象没有访问权限可以通过：void seetAccessible(true)打开权限
 构造器可以通过T newInstance(Object... initargs)调用自己，传入参数！
 */
public class TestStudent02{
    // 1. 调用构造器得到一个类的对象返回。
    @Test
    public void getDeclaredConstructor() throws Exception {
        // a.第一步：获取类对象
        Class c = Student.class;
        // b.定位单个构造器对象（按照参数定位无参数构造器对象）
        Constructor constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        // 如果遇到了私有的构造器，可以暴力反射
        constructor.setAccessible(true); // 权限被打开了。
        Student s = (Student) constructor.newInstance();
        System.out.println(s);
        System.out.println("======================================");

        // c.定位单个构造器对象（按照参数定位有参数构造器对象）
        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor1.getName() + "===>" + constructor1.getParameterCount());
        Student s1 = (Student) constructor1.newInstance("孙悟空", 1000);
        System.out.println(s1);
    }
}
