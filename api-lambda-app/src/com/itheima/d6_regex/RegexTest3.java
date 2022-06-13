package com.itheima.d6_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        // 目标：校验手机号码，邮箱号码，电话号码
//        checkPhone();
//        checkEmail();
        checkTel();

        // 同学可以做个校验金额是否正确： 99 0.99 11.3是正确的   11.22.11就是错误的
    }

    public static void checkTel(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入电话号码：");
            String tel = sc.next();

            // 判断电话号码格式是否合法 020-123456  0201342345
            if (tel.matches("0\\d{2,3}-?\\d{7,9}")){
                System.out.println("格式正确，注册成功!");
                break;
            }else {
                System.out.println("输入有误");
            }
        }
    }

    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入邮箱：");
            String email = sc.next();

            // 判断邮箱格式是否合法
            // 2342242352@qq.com
            // 2322wref42@163.com
            // 122142352@itheima.com.cn
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){
                System.out.println("格式正确，注册成功!");
                break;
            }else {
                System.out.println("输入有误");
            }
        }
    }

    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入手机号码：");
            String phone = sc.next();

            // 判断手机号码是否合法
            if (phone.matches("1[3-9]\\d{9}")){
                System.out.println("格式正确，注册成功!");
                break;
            }else {
                System.out.println("输入有误");
            }
        }
    }


}
