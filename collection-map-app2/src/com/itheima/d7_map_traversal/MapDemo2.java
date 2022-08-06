package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        // 1. 添加元素：无序，不重复，无索引。
        maps.put("娃娃", 30);
        maps.put("iphoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);
        // maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}
        /**
            maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}
                Q
            使用foreach遍历map集合，发现Map集合的键值对元素直接是没有类型的，所以不可以 直接foreach.
                Q
            可以通过Map的方法entrySet把Map集合转换成Set集合形式。
                Q
            Set<Map.Entry<String, Integer>> entries = [(huawei=1000), (手表=10), (生活用品=10), (iphoneX=100), (娃娃=30)]

            此时可以使用foreach遍历了。

         */
        // 1. 把Map集合转换成Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();

        // 2. 开始遍历
        for (Map.Entry<String, Integer> entry: entries){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "======>" + value);
        }
    }
}
