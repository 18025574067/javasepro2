package com.itheima.d9_map_impl;

import com.itheima.d1_collection_set.Apple;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> maps2 = new TreeMap<>();
        maps2.put(1, "王麻子");
        maps2.put(13, "县长");
        maps2.put(3, "张三");
        System.out.println(maps2);

        // TreeMap集合自带排序, 可排序，不重复(只要大小规则一样就认为重复)，无索引。
        Map<Apple, String> maps1 = new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });


        maps1.put(new Apple("红富士", "红色", 9.9, 500), "山东");
        maps1.put(new Apple("青苹果", "青色", 19.9, 300), "江西");
        maps1.put(new Apple("绿苹果", "绿色", 29.9, 800), "海南");
        maps1.put(new Apple("黄苹果", "黄色", 9.8, 500), "湖南");
        System.out.println(maps1);


    }
}
