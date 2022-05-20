package com.itheima.d11_api_stringbuilder;

/**
    目标：学会使用StringBuilder操作字符串，最终还需要知道它性能好的原因。
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append(1);
        sb.append("abc");
        sb.append(true);
        sb.append(3.3);

        StringBuilder sb1 = new StringBuilder();
        // 支持链式编程。
        sb1.append("a").append("b").append("c").append("我爱你中国");
        sb1.reverse().append(110);


        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb1.length());

        // 注意：StringBuilder只是拼接字符串的手段，效率好
        // 最终的目的还是转换成字符串。
        StringBuilder sb2 = new StringBuilder();
        sb2.append(123).append(456);
        String rs = sb2.toString();
        check(rs);

    }
    public static void check(String data){
        System.out.println(data);
    }
}
