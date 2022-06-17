package com.itheima.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用Lambda的标准格式来简化匿名内部类的代码形式。
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑得很慢。");
            }
        };
        a.run();


//        Animal a1 = () -> {
//            System.out.println("乌龟跑得很慢。");
//        }
//    };
//        a1.run();


}
}


abstract class Animal{
    public abstract void run();
}
