package com.itheima.d9_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        // 1. 创建一个Map集合对象
        Map<String, Integer> maps = new LinkedHashMap<>(); // 一行经典代码。
        maps.put("鸿星尔克", 3);
        maps.put("Java", 3);
        maps.put("枸杞", 100);
        maps.put("Java", 100); // 会覆盖前面的值。
        maps.put(null, null);
        System.out.println(maps);

    }
}
