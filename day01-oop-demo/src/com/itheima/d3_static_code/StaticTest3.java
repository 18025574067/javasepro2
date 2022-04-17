package com.itheima.d3_static_code;

import java.util.ArrayList;

public class StaticTest3 {

    /**
        1. 定义一个静态的集合，这样这个集合只加载一个，因为当前房间只需要一副牌。
     */

    /**
        2. 在程序运行main方法前，把54张牌先放进去。
     */
    private static ArrayList<String> cards = new ArrayList<>();

    public static void main(String[] args) {
        //目标：模块游戏启动前，初始化54张牌数据。
    }
}
