package com.itheima.d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 目标：斗地主游戏的案例开发。

 业务需求分析：
    斗地主的做牌，洗牌，发牌，排序（拓展知识），看牌。
    业务：总共有54张牌。
    点数："3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2".
    花色："♠", "♡", "♢", "♣"
    大小王："♛", "♔".
    点数分别要组合4种花色，大小王各一张。
    斗地主：发出51张牌，剩下3张作为底牌。
 功能：
    1.做牌
    2.洗牌
    3.定义3个玩家
    4.发牌
    5.排序（拓展，了解，作业）
    6.看牌
 */
public class GameDemo {
    /**
        1. 定义一个静态的集合存储54张牌

     */

    public static List<Card> allCard = new ArrayList<>();

    /**
        2. 做牌：定义静态代码块初始化数据

     */
    static {
        // 3. 定义点数：个数确定，类型确定，使用数组
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 4. 定义花色：个数确定，类型确定，使用数组
        String[] colors = {"♠", "♡", "♢", "♣"};

        // 5. 组合点数和花色
        for (String size : sizes) {
            for (String color : colors) {
                // 6. 封装成一个牌对象
                Card c = new Card(size, color);
                // 7. 存入到集合容器中
                allCard.add(c);
            }
        }
        // 8. 大小王存入到牌中
        Card c1 = new Card("", "♔");
        Card c2 = new Card("", "♛");
        Collections.addAll(allCard, c1, c2);
        System.out.println("新牌：" + allCard);
    }


    public static void main(String[] args) {

    }
}
