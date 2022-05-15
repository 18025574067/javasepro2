package com.itheima.d5_innerclass_static;

/**
    外部类
 */
public class Outer {
    /**
        学习静态成员内部类
     */
    public static class Inter {
        public String name;
        private int age;
        public static String schoolName;

        public void show(){
            System.out.println("姓名：" + name);
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
