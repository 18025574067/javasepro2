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
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String ele = it.next();
//            if ("Java".equals(ele)){
////                list.remove("Java"); // 报错
//                it.remove(); // 使用迭代器删除元素，可以保证不后移，能够成功遍历并删除元素。
//            }
//        }

        // b. foreach删除
//        for (String s : list) {
//            if ("Java".equals(s)){
//                list.remove(s);
//            }
//        }

        // c. lambda删除
//        list.forEach(s ->{
//            if ("Java".equals(s)) {
//                list.remove(s);}
//            });

        // d. for循环（不会出现异常错误，但会漏删除元素，）
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if ("Java".equals(ele)){
//                list.remove(ele);
//                i--;
//            }
//        }
        // 从后往前删。
        for (int i = list.size()-1; i >= 0; i--) {
            String ele = list.get(i);
            if ("Java".equals(ele)){
                list.remove(ele);
            }
        }

        System.out.println(list);
    }
}
