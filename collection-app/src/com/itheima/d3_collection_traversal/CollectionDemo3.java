package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
    Collection 集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
    Collection 集合的遍历方式有三种上：
        （1）迭代器
        （2）foreach(增加for 循环)
        （3）JDK 1.8 开始之后的新技术Lambda表达式。
    c.JDK 1.8 开始之后的新技术 Lambda表达式。
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("殷素素");
        lists.add("周芷若");
        System.out.println(lists);

//        lists.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        lists.forEach(s -> {
//                System.out.println(s);
//                });

//        lists.forEach(s -> System.out.println(s));

        lists.forEach( System.out::println);
    }
}
