package com.itheima.d5_innerclass_static;

/**
    外部类
 */
public class Outer {

    // 外部类静态成员，内部类可以直接访问
    public static int a = 100;
    // 实例成员只能用对象来访问
    private String hobby;
    /**
        学习静态成员内部类
     */
    public static class Inter {
        public String name;
        private int age;
        public static String schoolName;

        public void show(){
            System.out.println("姓名：" + name);
            System.out.println(a);
            // System.out.println(hobby); // 外部实例成员只能用对象访问
            // 间接访问
            Outer o = new Outer();
            System.out.println(o.hobby);
        }

        public Inter(){}

        public Inter(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
