package com.itheima.d1_unchange_collection;

import java.util.List;

/**
    不可变集合。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<Double> lists = List.of(575.5, 700.4, 525.5, 570.0);
//        lists.add(555.5);
        System.out.println(lists);
    }
}
