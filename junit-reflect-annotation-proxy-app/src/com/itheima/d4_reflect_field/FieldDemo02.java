package com.itheima.d4_reflect_field;

import org.junit.Test;
import java.lang.reflect.Field;

/**
    目标：反射获取成员变量：取值和赋值。

    Field的方法：给成员变量赋值和取值
        void set(Object obj, Object value):给对象注入某个成员变量数据
        Object get(Object obj):获取对象的成员变量的值。
        void setAccessible(true):暴力反射，设置为可以直接访问私有类型的属性。
        Class getTypr();获取属性的类型，返回Class对象。
        String getName();获取属性的名称。
 */
public class FieldDemo02{
    @Test
    public void setField() throws Exception {
        // a. 反射的第一步，获取类对象
        Class c = Student.class;
        // b. 提取某个成员变量
        Field ageF = c.getDeclaredField("age");

        Student zzj = new Student();
        // zzj.setAge(1000);
        
        // c. 赋值
        ageF.setAccessible(true);
        ageF.set(zzj, 1000);
    }
}