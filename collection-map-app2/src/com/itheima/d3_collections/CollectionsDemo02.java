package com.itheima.d3_collections;

import java.util.*;

/**
    目标：引用数据类型的排序。
    字符串按照首字符的编号升序排序。

    自定义类型的比较方法API： Collections
        public static <T> void sort(List<T> list):
            将集合中元素按照默认规则排序。
            对于自定义的引用类型的排序人家根本不知道怎么排，直接报错！

        public static <T> void sort(List<T> list, Comparator<? super T> c):
            将集合中元素按照指定规则排序，自带比较器
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(); // 可以重复。
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "青色", 19.9, 300));
        apples.add(new Apple("绿苹果", "绿色", 29.9, 800));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));

        System.out.println(apples);

//        Collections.sort(apples); // 方法一： 可以的，Apple类已经重写了比较规则。

        // 方法二：sort自带比较器对象

//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o2.getPrice(), o1.getPrice());
//            }
//        });

        // 简化写法：
        Collections.sort(apples, (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));

        System.out.println(apples);

    }
}
