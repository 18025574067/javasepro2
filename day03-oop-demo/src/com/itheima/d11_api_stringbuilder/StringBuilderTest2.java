package com.itheima.d11_api_stringbuilder;

/**
    目标：定义一个方法，输入任意整数数组，输出[11, 22, 44, 3]的格式。
 */
public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(toString(arr));

        int[] arr1 = {11, 23, 45, 21, 55};
        System.out.println(toString(arr1));

        int[] arr2 = {};
        System.out.println(toString(arr2));

    }
    // 1. 定义方法接收整形数组，返回数组内容格式
    public static String toString(int[] arr){
        if (arr != null) {
            // 2. 开始拼接内容。
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1? "": ", ");
            }
            sb.append("]");
            return sb.toString();
        }else {
            return null;
        }
    }
}
