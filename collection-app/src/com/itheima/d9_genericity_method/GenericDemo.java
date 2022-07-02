package com.itheima.d9_genericity_method;

import java.util.Arrays;

/**
        定义了泛型的方法就是泛型方法
    泛型方法的定义格式：
        修饰符<泛型变量> 返回值类型 方法名称(形参列表){}
    注意：方法定义了什么泛型变量，后面就只能用什么泛型变量。
    泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据变量。

 需求：给你任何一个类型的数组，都能返回它的内容。Arrays.toString(数组)的功能！

 小结：
    泛型方法可以让方法更灵活的接收数据，可以做通用技术！
 */
public class GenericDemo {
    public static void main(String[] args) {
//        需求：给你任何一个类型的数组，都能返回它的内容。Arrays.toString(数组)的功能！
        String[] names = {"小璐", "蓉容", "小何"};
        printArrays(names);

        Integer[] ages = {10, 20, 30};
        printArrays(ages);

        Integer[] ages1 = getArr(ages);
        String[] names1 = getArr(names);
    }

    public static <T> T[] getArr(T[] arr){
        return arr;
    }

    public static <T> void printArrays(T[] arr){
        if (arr != null){
            StringBuilder stringBuilder = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                stringBuilder.append(arr[i]).append(i == arr.length-1? "": ", ");
            }
            stringBuilder.append("]");
            System.out.println(stringBuilder);
        }else {
            System.out.println(arr);
        }
    }
}
