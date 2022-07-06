package com.itheima.set;

import java.util.HashSet;
import java.util.Set;

/**
    目标：让set集合把重复内容的对象去掉（去重复）

 */
public class SetDemo3 {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();

        // Set集合去重原理：先判断哈希值，再判断equals.
        Student s1 = new Student("无恙", 20, '男');
        Student s2 = new Student("无恙", 20, '男');
        Student s3 = new Student("周雄", 21, '男');

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);


    }
}
