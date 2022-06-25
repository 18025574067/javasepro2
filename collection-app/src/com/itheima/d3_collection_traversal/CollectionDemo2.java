package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
        (3) JDK1.8开始之后的新技术Lambda表达式。

    b. foreach(增强for循环)遍历集合。
        foreach是一种遍历形式，可以遍历集合或者数组。
        foreach遍历集合实际上是迭代器遍历集合的简化写法。
        foreach遍历的关键是记住格式：
            for(被遍历集合或者数组中元素的类型 变量名称：被遍历集合或者数组){

            }
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("殷素素");
        lists.add("周芷若");
        System.out.println(lists);
        // {赵敏，小昭， 殷素素，周芷若}
        // ele

        for (String ele : lists) {
            System.out.println(ele);
        }

        System.out.println("----------------------");
        double[] scores = {100, 99.5, 59.5};

        for (double score : scores) {
            System.out.println(score);
            if (score == 59.5){
                score = 100; // 修改无意义，不会修改集合的值。
            }
        }
        System.out.println(Arrays.toString(scores));

    }
}
