package com.itheima.d2_stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
    目标：收集Stream流的数据到集合和数组。
 */
public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        System.out.println(list);

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList());
        System.out.println(zhangList);

        // 流只能使用一次。
        Set<String> zhangSet = s1.collect(Collectors.toSet());
        System.out.println(zhangSet);


    }
}
