package com.itheima.d9_map_impl;

import com.itheima.d1_set.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        // Map集合是根据键去除元素的

        Map<Student, String> maps = new HashMap();

        // Set集合去重原理：先判断哈希值，再判断equals.
        Student s1 = new Student("无恙", 20, '男');
        Student s2 = new Student("无恙", 20, '男');
        Student s3 = new Student("周雄", 21, '男');

        maps.put(s1, "北京");
        maps.put(s2, "上海");
        maps.put(s3, "广州");

        System.out.println(maps);
    }
}
