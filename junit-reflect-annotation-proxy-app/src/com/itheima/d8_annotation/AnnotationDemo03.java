package com.itheima.d8_annotation;


/**
    目标：完成注解的解析。
 */
public class AnnotationDemo03 {
    public static void main(String[] args) {
    
    }    
}

@Bookk(value="《情深深雨濛濛》", price= 99.9, author={"琼瑶", "dlei"})
class BookStore{

    @Bookk(value="《三少爷的剑》", price= 99.9, author={"古龙", ""})
    public void test(){}

}
