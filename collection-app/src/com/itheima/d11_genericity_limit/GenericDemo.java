package com.itheima.d11_genericity_limit;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
//        go(dogs); // 完美的避开了。
    }


    /**
        所有车比赛
     */
    public static void go(ArrayList<? extends Car> cars){}
}
// 父类

class Dog{}

class BMW extends Car{}

class BENZ extends Car{}

class Car{}