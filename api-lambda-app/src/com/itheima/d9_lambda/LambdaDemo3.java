package com.itheima.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        // 自定义比较器对象，只能支持引用类型的排序
        Integer[] ages1 = {12, 34, 10, 23};

//        Arrays.sort(ages1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1; // 降序。
//            }
//        });

//        Arrays.sort(ages1, (Integer o1, Integer o2) -> {
//            return o2 - o1; // 降序。
//        });

//        Arrays.sort(ages1, (o1, o2) -> {
//            return o2 - o1; // 降序。
//        });

        Arrays.sort(ages1, (o1, o2) ->  o2 - o1);


        System.out.println(Arrays.toString(ages1));

        System.out.println("==========================");

        JFrame win = new JFrame("登录界面：");

        JButton btn = new JButton("我是一个很大的按钮");

//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("有人点我，点我，点我！！");
//            }
//        });

//        btn.addActionListener((ActionEvent e) -> {
//                System.out.println("有人点我，点我，点我！！");
//            }
//        );

//        btn.addActionListener((e) -> {
//                    System.out.println("有人点我，点我，点我！！");
//                }
//        );

//        btn.addActionListener(e -> {
//                    System.out.println("有人点我，点我，点我！！");
//                }
//        );

        btn.addActionListener(e -> System.out.println("有人点我，点我，点我！！"));

        win.add(btn);
        win.setSize(400, 300);
        win.setVisible(true);
    }
}
