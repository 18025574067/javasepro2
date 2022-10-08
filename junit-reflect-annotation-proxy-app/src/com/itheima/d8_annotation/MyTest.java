package com.itheima.d8_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD}) // 元注解
public @interface MyTest {
}
