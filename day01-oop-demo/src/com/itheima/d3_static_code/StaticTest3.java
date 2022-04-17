package com.itheima.d3_static_code;

import java.util.ArrayList;

public class StaticTest3 {

    /**
        1. 定义一个静态的集合，这样这个集合只加载一个，因为当前房间只需要一副牌。
     */

    private static ArrayList<String> cards = new ArrayList<>();
    /**
        2. 在程序运行main方法前，把54张牌先放进去，后续游戏就可以直接使用。
     */

    static {
        // 3. 正式做牌，放到集合中去即可。
        // a. 定义一个数组存储全部点数，类型确定了，个数确定了。
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
        // b. 定义一个数组存储全部花色，类型确定了，个数确定了。
        String[] colors = {"♥", "♠", "♦", "♣"};
        // c. 遍历点数
        for (int i = 0; i < sizes.length; i++) {
            // sizes[i]
            // d. 遍历花色
            for (int j = 0; j < colors.length; j++) {
                // colors[j]
                // 一张牌
                String cars = sizes[i] + colors[j];
                cards.add(cars);

            }
        }
        // e. 单独加入大小王
        cards.add("大♛");
        cards.add("小♛");
    }

    public static void main(String[] args) {
        //目标：模块游戏启动前，初始化54张牌数据。
        System.out.println("新牌：" + cards);
    }
}
