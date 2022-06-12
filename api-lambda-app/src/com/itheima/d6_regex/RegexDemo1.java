package com.itheima.d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        // 需求：检验QQ号码，必须为全数字 6-20位
        System.out.println(checkQQ("123221a22"));
        System.out.println(checkQQ("12322122"));
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("123"));

        System.out.println("------------------------------------------------");

        // 正则初体验
        System.out.println(checkQQ2("123221a22"));
        System.out.println(checkQQ2("12322122"));
        System.out.println(checkQQ2(null));
        System.out.println(checkQQ2("123"));
    }
    public static boolean checkQQ2(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        // 1. 判断qq号码的长度是否满足要求
        if (qq == null || qq.length() < 6 || qq.length() > 20){
            return false;
        }

        // 2. 判断qq是否为纯数字，不是返回false
        // 23432a112
        for (int i = 0; i < qq.length(); i++) {
            // 获取每位字符
            char ch = qq.charAt(i);
            // 判断这个字符是否不是数字，不是返回false
            if (ch < '0' || ch > '9'){
                return false;
            }
        }
        return true; // 肯定合法了。
    }
}
