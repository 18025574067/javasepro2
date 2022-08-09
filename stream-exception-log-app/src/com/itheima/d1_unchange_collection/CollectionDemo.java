package com.itheima.d1_unchange_collection;

import java.util.List;
import java.util.Set;

/**
    不可变集合。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 1. 不可变的List集合。
        List<Double> lists = List.of(575.5, 700.4, 525.5, 570.0);
//        lists.add(555.5);
//        lists.set(2, 555.0);
        System.out.println(lists);

        double score = lists.get(1);
        System.out.println(score);

        // 2. 不可变的Set集合。
        Set<String> names = Set.of("迪丽热巴", "迪丽热九", "马尔扎哈", "卡尔眨巴");
    }
}
