package com.itheima.d2_recursion;

/**
    目标： 啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，
    请问，10元可以喝多少瓶啤酒，剩余几个盖子和几空瓶？
    答案：15瓶，3个瓶子，1空瓶。
 */
public class RecursionDemo06 {

    public static int totalNumber;  // 总数量
    public static int lastBottleNumber; // 记录剩余瓶子的数量。
    public static int lastCoverNumber;  // 记录剩余盖子的数量。

    public static void main(String[] args) {
        // 1. 拿钱买洒
        buyBeer(10);
        System.out.println("总数量：" + totalNumber);
        System.out.println("剩余瓶子：" + lastBottleNumber);
        System.out.println("剩余盖子：" + lastCoverNumber);

    }
    public static void buyBeer(int money){
        // 2. 看可以立马买多少瓶
        int buyNumber = money / 2;  // 5
        totalNumber += buyNumber;

        // 3. 把盖子和瓶子换算成钱
        // 统计本轮总的盖子数，和瓶子数
        int coverNumber = lastCoverNumber + buyNumber; // Cover盖子
        int bottleNumber = lastBottleNumber + buyNumber; // Bottle瓶子


        // 统计可以换算的钱
        int allMoney = 0;
        if (coverNumber >= 4){
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber = coverNumber % 4;

        if (bottleNumber >= 2){
            allMoney += (bottleNumber /2) * 2;
        }
        lastBottleNumber = bottleNumber % 2;

        if (allMoney >= 2){
            buyBeer(allMoney);
        }
    }
}
