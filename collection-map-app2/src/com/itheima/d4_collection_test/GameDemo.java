package com.itheima.d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    // 2. 做牌：定义静态代码块初始化数据

    static {
        // 3. 定义点数：个数确定，类型确定，使用数组
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 4. 定义花色：个数确定，类型确定，使用数组
        String[] colors = {"♠", "♡", "♢", "♣"};

        // 5. 组合点数和花色
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6. 封装成一个牌对象
                Card c = new Card(size, color, index);
                // 7. 存入到集合容器中
                allCard.add(c);
            }
        }
        // 8. 大小王存入到牌中
        Card c1 = new Card("", "♔", ++index);
        Card c2 = new Card("", "♛", ++index);
        Collections.addAll(allCard, c1, c2);
        System.out.println("新扑克牌：" + allCard);
    }


    public static void main(String[] args) {
        // 9. 洗牌
        Collections.shuffle(allCard);
        System.out.println("--------------------------------------------");
        System.out.println("洗牌后： " + allCard);

        // 10. 发牌，定义3个玩家，每个玩家也是一个集合容器
        List<Card> linghuchong = new ArrayList<>(); // 令狐冲
        List<Card> jiumozhi = new ArrayList<>(); // 鸠摩智
        List<Card> renyingying = new ArrayList<>(); // 任盈盈

        // 11. 开始发牌 (从牌集合中发出51张给三个玩家，剩余3张作为底牌)
        // allCards = ♠3, ♡3, ♢3, ♣3, ♠4, ♡4, ♢4, ♣4, ♠5, ♡5, ♢5, ♣5, ♠6, ♡6, ♢6, ♣6, ♠7, ♡7, ♢7, ♣7, ♠8, ♡8, ♢8, ♣8, ♠9, ♡9, ♢9, ♣9, ♠10, ♡10, ♢10, ♣10, ♠J, ♡J, ♢J, ♣J, ♠Q, ♡Q, ♢Q, ♣Q, ♠K, ♡K, ♢K, ♣K, ♠A, ♡A, ♢A, ♣A, ♠2, ♡2, ♢2, ♣2, ♔, ♛
        //     i    = 0    1    2   3   4   5  6  7  8

        for (int i = 0; i < allCard.size() - 3; i++) {
            // 先拿到当前牌对象
            Card c = allCard.get(i);
            if (i % 3 == 0){
                // 请阿冲接牌
                linghuchong.add(c);
            }else if (i % 3 == 1){
                // 请阿鸠接牌
                jiumozhi.add(c);
            }else {
                // 请盈盈接牌
                renyingying.add(c);
            }

        }
        // 12. 拿到最后三张牌(把最后三张牌截取成一个子集合)
        List<Card> lastThreeCard = allCard.subList(allCard.size() - 3, allCard.size());

        // 13. 给玩家的牌排序（从大到小，可以自己先试试怎么实现）
        sortCards(linghuchong);
        sortCards(jiumozhi);
        sortCards(renyingying);

        // 14. 输出玩家的牌。
        System.out.println("--------------------------------------------");
        System.out.println("阿冲：" + linghuchong);
        System.out.println("阿智：" + jiumozhi);
        System.out.println("盈盈：" + renyingying);
        System.out.println("--------------------------------------------");
        System.out.println("最后三张牌： " + lastThreeCard);

    }

    /**
        给牌排序
     * @param cards
     */
    private static void sortCards(List<Card> cards) {


//        Collections.sort(cards, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o1.getIndex() - o2.getIndex();
//            }
//        });

        Collections.sort(cards, (Card o1, Card o2) -> o1.getIndex() - o2.getIndex());
    }
}
