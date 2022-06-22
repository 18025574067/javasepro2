package com.itheima.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
    - public Object[] toArray(): 把集合中的元素，存储到数组中。
    小结：
        记住以上API。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // HashSet: 添加的元素是无序，不重复，无索引。
        Collection<String> list = new ArrayList<>();

        // 1. 添加元素，添加成功返回 True.
        list.add("Java");
        list.add("MySQL");
        list.add("HTML");
        System.out.println(list.add("HTML"));
        list.add("Java");
        System.out.println(list.add("黑马"));
        System.out.println(list);

        // 2. 清空集合的元素。
//      list.clear();
        // System.out.println(list);

        // 3. 判断集合是否为空 是空返回true, 反之。
        System.out.println(list.isEmpty());

        // 4. 获取集合的大小。
        System.out.println(list.size());

        // 5. 判断集合中是否包含某个元素。
        System.out.println(list.contains("Java")); // true
        System.out.println(list.contains("java")); // false
        System.out.println(list.contains("黑马")); // true

        // 6. 删除某个元素：如果有多个重复元素默认删除前面的第一个。
        System.out.println(list.remove("java"));
        System.out.println(list);
        System.out.println(list.remove("Java"));
        System.out.println(list);

        // 7. 把集合转换为数组 [Java, 独孤求败, HTML, Mubatis].
        Object[] arrs = list.toArray();
        System.out.println("数组：" + Arrays.toString(arrs));

        System.out.println("--------------------拓展-----------------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("Java1");
        c1.add("Java2");

        Collection<String> c2 = new ArrayList<>();
        c2.add("殷素素");
        c2.add("赵敏");

        // addall() 把c2的集合全部倒到c1
        c2.addAll(c1);
        System.out.println(c2);


    }











}
