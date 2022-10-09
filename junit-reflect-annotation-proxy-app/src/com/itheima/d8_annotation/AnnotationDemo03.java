package com.itheima.d8_annotation;


import org.junit.Test;
import java.lang.annotation.Annotation;

/**
    目标：完成注解的解析。
 */
public class AnnotationDemo03 {
    @Test
    public void parseClass() {
        // a. 先得到类对象
        Class c = BookStore.class;
        // b. 判断这个类上面是否存在这个注解
        if(c.isAnnotationPresent(Bookk.class)){
            // c. 直接获取该注释对象
            Annotation book = c.getDeclaredAnnotation(Bookk.class);
        }
    }    
}

@Bookk(value="《情深深雨濛濛》", price= 99.9, author={"琼瑶", "dlei"})
class BookStore{
    @Bookk(value="《三少爷的剑》", price= 99.9, author={"古龙", "熊耀华"})
    public void test(){}
}
