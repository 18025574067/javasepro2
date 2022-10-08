package com.itheima.d8_annotation;

/**
    目标：学会自定义注释，掌握其定义格式和语法。
 */
@MyBook(name="《精通JavaSE》", authors= {"黑马", "dlei"}, price= 199.5)
// @Book(value="/delete")
//@Book("/delete") // 单属性可以省略"value="
@Book(value = "/delete", price = 19.5)
//@Book("/delete") // price有黰认值可以不写。
public class AnnotationDemo01 {
    @MyBook(name="《精通JavaSE1》", authors= {"黑马", "dlei"}, price= 199.5)
    private AnnotationDemo01(){}

    @MyBook(name="《精通JavaSE2》", authors= {"黑马", "dlei"}, price= 199.5)
    public static void main(String[] args) {}
}

