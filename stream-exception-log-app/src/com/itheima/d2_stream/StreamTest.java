package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
    初步体验Stream流的便捷。
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "周芷若", "赵敏", "张无忌", "张强");
        System.out.println(names);
    }
}
