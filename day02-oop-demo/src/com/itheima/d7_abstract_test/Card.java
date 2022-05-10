package com.itheima.d7_abstract_test;

public abstract class Card {
    private String cardName;
    private double money;

    /**
        定义一个支付功能
        抽象方法。
     */
    public abstract void buy(double money);

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
