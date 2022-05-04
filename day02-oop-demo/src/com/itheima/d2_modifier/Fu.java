package com.itheima.d2_modifier;

public class Fu {
    /**
        1. 定义一个私有成员：private只能本类中访问。
     */
    private void privateMethod(){
        System.out.println("---------private---------");
    }

    /**
        2. 定义一个缺省成员：缺省只能本类和同包下其他类中访问（包访问权限）。
     */
    void method(){
        System.out.println("---------method---------");
    }

    /**
        3. 定义一个protected修饰的方法, 同类，同包的其他类中，其他包的子类中访问。
     */
    protected void protectedMethod(){
        System.out.println("-----------protected------------");
    }

    /**
        4. public修饰的方法，同类，同包的其他类中，其他包的子类，其他包的无关类中都能访问
     */
    public void publicMethod(){
        System.out.println("-------------public-----------------");
    }

    public static void main(String[] args) {
        // 本类中访问
        Fu f = new Fu();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
