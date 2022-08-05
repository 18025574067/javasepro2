package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;

/**
    2. 遍历键的Set集合，然后通过键找值
 小结：
    代码简单，需要记住。
 */
public class MapDemo1 {
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



    }






}
