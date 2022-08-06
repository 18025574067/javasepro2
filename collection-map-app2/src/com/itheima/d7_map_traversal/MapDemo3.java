package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
        (3) JDK 1.8开始之后的新技术，Lambda表达式。

    c.JDK 1.8 开始之后的新技术：Lambda表达式。（暂时了解）
 */
public class MapDemo3 {
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

//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + "--->" + value);
//            }
//        });

        maps.forEach((k, v) -> System.out.println(k + "--->" + v));
    }
}
