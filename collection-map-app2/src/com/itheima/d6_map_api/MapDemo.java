package com.itheima.d6_map_api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
//        maps.clear();
//        System.out.println(maps);

        // 3. 判断集合是否为空，为空返回true, 反之
        System.out.println(maps.isEmpty());


        // 4. 根据键获取对应值：public V get(Object key)
        Integer key = maps.get("huawei");
        System.out.println(key);
        System.out.println(maps.get("手表"));
        System.out.println(maps.get("生活用品"));
        System.out.println(maps.get("生活用品2"));

        // 5. 根据键删除整个元素 （删除键会返回键的值）
        System.out.println(maps.remove("iphoneX"));
        System.out.println(maps);

        // 6. 判断是否包含某个键，包含返回true, 反之
        System.out.println(maps.containsKey("娃娃"));
        System.out.println(maps.containsKey("iphoneX"));


        // 7. 判断是否包含某个值。
        System.out.println(maps.containsValue(100));
        System.out.println(maps.containsValue(10));
        System.out.println(maps.containsValue(22));


        // {huawei=1000, 手表=10, 生活用品=10, 娃娃=20}

        // 8. 获取全部键的集合： public Set<K> keySet()
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        System.out.println("--------------------------------");
        // 9. 获取全部值的集合： Collection<V> value();
        Collection<Integer> values = maps.values();
        System.out.println(values);


        // 10. 集合的大小。
        System.out.println(maps.size());

        // 11. 合并其他集合（拓展）
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java1", 1);
        map1.put("java2", 1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java2", 100);
        map2.put("python1", 1);
        map2.put("python2", 1);
        map1.putAll(map2); // 从map2拷贝一份到map1。
        System.out.println(map1);
        System.out.println(map2);



    }
}
