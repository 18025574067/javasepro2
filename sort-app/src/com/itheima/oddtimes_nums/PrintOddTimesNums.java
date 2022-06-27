package com.itheima.oddtimes_nums;

public class PrintOddTimesNums {
    public static void main(String[] args) {
        // 异或计算出现已知只出现奇数次的数字。

        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 3};
        printOddTimesNums1(arr);

    }

    public static void printOddTimesNums1(int[] arr){
        int eor = 0;
        for (int cur: arr){
            eor ^= cur;

        }
        System.out.println(eor);
    }
}
