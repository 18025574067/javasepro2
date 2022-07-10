package com.itheima.d1_set;

import java.util.Set;
import java.util.TreeSet;

/**
    目标：观察TreeSet对于有值特性的数据如何排序。
 */
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>(); // 不重复，无索引，可排序。
        sets.add(23);
        sets.add(24);
        sets.add(2);
        sets.add(21);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>(); // 不重复，无索引，可排序。
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("about");
        sets1.add("黑马");
        sets1.add("About");
        sets1.add("Python");
        sets1.add("UI");
        sets1.add("UI");
        System.out.println(sets1);

        System.out.println("------------------------------");

        Set<Apple> apples = new TreeSet<>();
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "青色", 19.9, 300));
        apples.add(new Apple("绿苹果", "绿色", 29.9, 800));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));

        System.out.println(apples);
    }
}
