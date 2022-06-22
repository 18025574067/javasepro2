package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
        2. 定义一个while 循环，问一次取一次。
            通过it.hasNext()询问是否有下一个元素，有就通过it.next()取出下一个元素。
    小结：
        记住代码。
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);


        // 1. 得到一个迭代器对象
        Iterator<String> it = lists.iterator();

        System.out.println("-----------------------");


    }
}
