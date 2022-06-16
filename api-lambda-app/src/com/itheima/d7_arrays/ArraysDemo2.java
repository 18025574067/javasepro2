package com.itheima.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 目标：自定义数组的排序规则，Comparator比较器对象。
        // 1. Arrays 的shot方法对于有值特性的数组是默认升序排序的。
        int[] ages = {12, 33, 2, 11};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // 2. 需求：降序排序
        // 自定义比较器对象，只能支持引用类型的排序
        Integer[] ages1 = {12, 34, 10, 23};

        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                // 指定比较规则
//                if (o1 > o2){
//                    return -1;
//                }else if (o1 < o2){
//                    return 1;
//                }
//                return 0;
                // 可以简化为：
//                return o1 - o2; // 默认升序
                return o2 - o1; // 降序。
            }
        });
        System.out.println(Arrays.toString(ages1));

        Student[] student = new Student[3];
        student[0] = new Student("吴磊", 23, 166.5);
        student[1] = new Student("谢鑫", 18, 176.5);
        student[2] = new Student("王亮", 20, 186.5);

        System.out.println(Arrays.toString(student));

//        Arrays.sort(student); // 直接运行奔溃。
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge(); // 按照年龄进行升序排序
//                return o2.getAge() - o1.getAge(); // 按照年龄进行降序排序
//                return o1.getHeight() - o2.getHeight(); // 不能直接按照浮点数进行升序排序
//                return Double.compare(o1.getHeight(), o2.getHeight()); // 浮点型比较可以这样写
                return Double.compare(o2.getHeight(), o1.getHeight()); // 浮点型比较降序
            }
        });
        System.out.println(Arrays.toString(student));

    }
}
