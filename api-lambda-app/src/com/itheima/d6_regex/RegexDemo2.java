package com.itheima.d6_regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        // public boolean matches(String regex):判断是否与正则表达式匹配，匹配返回true
        // 只能是 a b c
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));

        // 不能匹配 a b c
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));

        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("333".matches("\\d"));
        System.out.println("z".matches("\\w"));
        System.out.println("2".matches("\\w"));
        System.out.println("21".matches("\\w"));
        System.out.println("你".matches("\\w"));
        // 以上正则匹配只能检验单个字符
        System.out.println("-------------------------------------");

        // 校验密码
        // 必须是数字 字母 下划线 至少 6 位
        System.out.println("ssds3c".matches("\\w{6,}"));
        System.out.println("ssdsc".matches("\\w{6,}"));
        System.out.println("ssdsda232s你c".matches("\\w{6,}"));
    }
}
