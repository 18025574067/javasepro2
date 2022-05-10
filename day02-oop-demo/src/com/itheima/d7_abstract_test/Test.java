package com.itheima.d7_abstract_test;

/**
 分析实现：
        1. 创建一个卡片父类，定义属性包括卡号名称，余额，支付功能（具体实现交给子类）
        2. 创建一个金卡卡类：重写支付功能，按照原价的8 折计算输出。
        3. 创建一个银卡卡类：重写支付功能，按照原价的8.5 折计算输出。
 */
public class Test {
    public static void main(String[] args) {
        // 目标：学习抽象类的基本使用：做父类，被继承，重写父类方法。
        GoldCard g = new GoldCard();
        g.setCardName("英斌");
        g.setMoney(10000);
        g.pay(300);


    }
}
