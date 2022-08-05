package com.itheima.d5_map;

import java.util.HashMap;
import java.util.Map;

/**
    目标：认识Map体系的特点：按照键无序，无索引，不重复，值不做要求。
 */
public class MapDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个Map集合对象
        Map<String, Integer> maps = new HashMap<>(); // 一行经典代码。
        maps.put("鸿星尔克", 3);
        maps.put("Java", 3);
        maps.put("枸杞", 100);
        maps.put("Java", 100); // 会覆盖前面的值。
        maps.put(null, null);
        System.out.println(maps);


    }
}
