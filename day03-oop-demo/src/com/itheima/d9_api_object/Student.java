package com.itheima.d9_api_object;

import java.util.Objects;

public class Student extends Object{
    // extends Object
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        // 1.判断是否是同一个对象比较，如果是返回true.
        if (this == o) return true;
        // 2. 如果o是null返回false 如果o不是学生类型返回false ...student != ..Pig.
        if (o == null || this.getClass() != o.getClass()) return false;
        // 3. 说明o一定是学生类型而且不为null.
        Student student = (Student) o;
        return this.sex == student.sex && this.age == student.age && Objects.equals(name, student.name);
    }

    /**
     自己重写equals方法，自己定制相同规则，
     两个对象内容相同就认为相同。
     s1.equals(s2)
     比较者：s1 == this
     被比较者：s2 == o
     */
//    @Override
//    public boolean equals(Object o){
//        // 1. 判断o 是不是学生类型
//        if (o instanceof Student){
//            Student s2 = (Student) o;
//            // 2. 判断两个学生内容是否相同
////            if (this.name.equals(s2.name) && this.age == s2.age
////               && this.sex == s2.sex){
////                return true;
////            }else {return false;}
//
//            return this.name.equals(s2.name) && this.age == s2.age
//                    && this.sex == s2.sex;
//        }else{
//            // 学生只能和学生比较，否则结果一定是false。
//            return false;
//        }
//    }

//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, sex, age);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
