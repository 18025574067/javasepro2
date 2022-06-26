package com.itheima.sort;

import java.util.Arrays;

public class CodeBubbleSort {
    // 冒泡排序

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 9, 3, 4, 6, 8, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int e = arr.length-1; e > 0; e--){ // 0 ~ e
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }
    // 交换arr的i和j位置上的值
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j]; // 异或，前提是i位置不能=j位置，不然会变成0了。
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
