package com.itheima.sort;

import java.util.Arrays;

public class CodeSelectionSort {
    // 选择排序
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 7, 4, 0, 8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j: minIndex;
            }
            swap(arr, i, minIndex);
        }
    }
    public static void swap(int[] arr, int i , int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
