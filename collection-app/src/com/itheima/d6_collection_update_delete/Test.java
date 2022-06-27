package com.itheima.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
    目标：研究集合遍历并删除元素可能出现的：并发修改异常问题。

 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("素素");
        System.out.println(list);

        // ["黑马", "Java", "Java", "赵敏", "赵敏", "素素"];
        //    it

        // 需求：删除全部的Java信息。
        // a. 迭代器删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            if ("Java".equals(ele)){
//                list.remove("Java"); // 报错
                it.remove();
            }
        }
        System.out.println(list);


        // b. foreach删除

        // c. lambda删除

        // d. for循环


    }
}
