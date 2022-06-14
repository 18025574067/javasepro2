package com.itheima.d7_arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        // 学会使用Arrays类的常用API，并理解其原理

        int[] arr = {10, 5, 100, 40, 35, 44, 99};
        System.out.println(arr);


        // 1. 返回数组内容的 toString(数组)。
//        String rs = Arrays.toString(arr);
//        System.out.println(rs);

        System.out.println(Arrays.toString(arr));

        // 2. 排序的API，默认自动对数组的元素进行升序排序。
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // API调用工程师

        // 3. 二分查找技术，前提数组必须先排序，否则出bug.
        // 返回值为
        int index = Arrays.binarySearch(arr, 55);
        System.out.println(index);


    }
}
