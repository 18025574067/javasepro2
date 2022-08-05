package com.itheima.d6_map_api;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // 1. 添加元素：无序，不重复，无索引。
        Map<String, Integer> maps = new HashMap<>(); // 一行经典代码。
        maps.put("iphoneX", 10);
        maps.put("娃娃", 20);
        maps.put("iphoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        // {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=31}
        System.out.println(maps);

        // 2. 清空集合

        // 3. 判断集合是否为空，为空返回true, 反之

        // 4. 根据键获取对应值：public V get(Object key)

        // 5. 根据键删除整个元素 （删除键会返回键的值）

        // 6. 判断是否包含某个键，包含返回true, 反之

        // 7. 判断是否包含某个值。
        // {huawei=1000, 手表=10, 生活用品=10, 娃娃=31}

        // 8. 获取全部键的集合： public Set<K> keySet()


        System.out.println("--------------------------------");
        // 9. 获取全部值的集合： Collection<V> value();

        // 10. 集合的大小。

















    }











}
