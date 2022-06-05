package com.itheima.d5_integer;

/**
    目标：明白包装类的概念，并使用
 */
public class Test {
    public static void main(String[] args) {
        int a = 100;
        Integer a1 = 111;
        Integer a2 = a; // 自动装箱
        System.out.println(a);
        System.out.println(a1);

        Integer it = 1;
        int it1 = it; // 自动拆箱

        double db = 99.5;
        Double db1 = db; // 自动装箱
        double db2 = db1; // 自动拆箱
        System.out.println(db2);

//        int age = null;
        Integer age1 = null;

        System.out.println("----------------------------");
        // 包装类可以把基本类型的数据转换成字符形式。（没啥用）
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs + 1);

        String rs1 = Integer.toString(i3);
        System.out.println(rs + 1);

        // 可以直接+字符串得到字符串类型
        String rs2 = i3 + "";
        System.out.println(rs2 + 1);

        System.out.println("----------------------------");
        String number = "23";
        // 转换成整数
//        int age = Integer.parseInt(number);
        int age = Integer.valueOf(number);
        System.out.println(age + 1);

        String number1 = "99";
        // 转换成小数
//        double score = Double.parseDouble(number1);
        double score = Double.valueOf(number1);
        System.out.println(score + 1);

    }
}
