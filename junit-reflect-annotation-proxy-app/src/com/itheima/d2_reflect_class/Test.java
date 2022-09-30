package com.itheima.d2_reflect_class;

/**
    目标：反射第一步，获取Class对象
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1.Class类的一个静态方法：forName(全限名：包名+类名)
        Class c = Class.forName("com.itheima.d2_reflect_class.Student");
        System.out.println(c);

        // 2. 类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 3. 对象.getClass(), 获取对象对应类的类对象。
        Student s1 = new Student();
        System.out.println(s1.getClass());
    }
}
