package com.itheima.d14_interface_attention;

public class Test {
    public static void main(String[] args) {
        // 目标：
        // 1. 接口不能创建对象
        // 2. 一个类实现多个接口，多个接口中有同样的静态方法不冲突。
        // 3. 一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的。
        // 4. 一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可。
        // 5. 一个接口继承了多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承。
        System.out.println();
    }
}
