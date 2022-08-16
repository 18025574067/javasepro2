package com.itheima.d8_exception_handle_runtime;

import java.util.Scanner;

/**
    需求：输入一个合理的价格为止，要求大于0。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请您输入合法的价格：");
            String priceStr = sc.nextLine();
            // 转换成double类型的价格。
            double price = Double.valueOf(priceStr);
            if (price > 0){
                System.out.println("定价：" + price);
                break;
            }else {
                System.out.println("价格必须是整数：");
            }
        }
    }
}
