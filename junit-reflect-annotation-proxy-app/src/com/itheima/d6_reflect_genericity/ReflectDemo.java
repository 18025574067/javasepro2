package com.itheima.d6_reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 需求：反射实现泛型擦除后，加入其他类型的元素
        ArrayList<Integer> lists = new ArrayList();
        ArrayList<String> lists1 = new ArrayList();
        
        System.out.println(lists.getClass());
        System.out.println(lists1.getClass());

        System.out.println(lists1.getClass() == lists.getClass());
        
        System.out.println("-----------------------------");
        ArrayList<Integer> lists2 = new ArrayList<>();
        lists2.add(23);
        lists2.add(21);
        // lists2.add("黑马");
        
        Class c = lists2.getClass(); // ArrayList.class
        // 定位c类中的add方法
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean rs = (boolean) add.invoke(lists2, "黑马");
        System.out.println(rs);

        System.out.println(lists2);
        
        ArrayList lists3 = lists2;
        lists3.add("白马");
        lists3.add(false);

        System.out.println(lists2);
    }


}
