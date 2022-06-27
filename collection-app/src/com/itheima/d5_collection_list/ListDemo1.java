package com.itheima.d5_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
    -public E get(int index):返回集合中指定位置的元素
    -public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
    -public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回更新前的元素值。
 小结：
        ArrayList集合的底层是基于数组存储数据，查询快，增删慢！（相对的）
 */
public class ListDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个ArrayList集合对象
        List<String> list = new ArrayList<>(); // 一行经典代码诞生了。
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");

        // List:有序，可重复，有索引的。
        list.add(1, "Python");

        // 2. 在某个索引位置插入元素

        // 3. 根据索引删除元素，返回被删除元素。

        // 4. 根据索引获取元素：public E get(int index): 返回集合中指定位置的元素。


        // 5. 修改索引位置处的元素：public E set(int index, E element)

    }
}
