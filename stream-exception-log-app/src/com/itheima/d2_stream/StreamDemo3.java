package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
    目标：Stream 流的常用API
        forEach: 逐一处理（遍历）
        count: 统计个数
            -- long count();
        filter: 过滤元素
            -- Stream<T> filter(Predicate<? super T> predicate)
        limit: 取前几个元素
        skip: 跳过前几个
        map: 加工方法
        concat: 合并流。

 */
public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        System.out.println(list);

        // Stream<T> filter(Predicate<? super T> predicate);
        list.stream().filter((String s) -> s.startsWith("张")).forEach((String s) -> System.out.println(s));
    }
}
