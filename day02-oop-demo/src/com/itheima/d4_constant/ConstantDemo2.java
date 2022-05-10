package com.itheima.d4_constant;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
    目标：常量的其他作用，做信息标志和信息分类（其实也是一种配置形式）
 */
public class ConstantDemo2 {
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;

    public static void main(String[] args) {
        // 1. 创建一个窗口对象（桌子）
        JFrame win = new JFrame();
        // 2. 创建一个面板对象（桌布）
        JPanel panel = new JPanel();
        // 3. 把桌布垫在桌子上
        win.add(panel);
        // 4. 创建四个按钮对象
        JButton btn1 = new JButton("上");
        JButton btn2 = new JButton("下");
        JButton btn3 = new JButton("左");
        JButton btn4 = new JButton("右");
        // 5. 把按钮对象添加到桌布上去
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        // 6. 显示窗口
        win.setLocationRelativeTo(null);
        win.setSize(300, 400);
        win.setVisible(true);

        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(UP);
            }
        });
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(DOWN);
            }
        });
        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(LEFT);
            }
        });
        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(RIGHT);
            }
        });
    }
    public static void move(int flag){
        switch (flag){
            case UP:
                System.out.println("玛丽向上跳了一下~~~~~~");
                break;
            case DOWN:
                System.out.println("玛丽向下蹲了一下~~~~~~");
                break;
            case LEFT:
                System.out.println("玛丽向左跑~~~~~~");
                break;
            case RIGHT:
                System.out.println("玛丽向右跑~~~~~~");
                break;
        }
    }
}
