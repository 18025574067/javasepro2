package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "赵敏", "周芷若", "张强");
        System.out.println(names);

        // 1. 从集合中找到姓 张 的放到新集合
        List<String> zhangList = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张")){
                zhangList.add(name);
            }
        }

        System.out.println(zhangList);

        // 2. 找出名称长度为3的放到新集合
        List<String> zhangThreeList = new ArrayList<>();
        for (String n : zhangList) {
            if (n.length() == 3){
                zhangThreeList.add(n);
            }
        }
        System.out.println(zhangThreeList);
    }
}
