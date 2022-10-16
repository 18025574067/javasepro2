package com.itheima.d2_xpath;

import org.junit.Test;

public class XPathDemo {
    /**
    1. 绝对路径：/根元素/子元素/子元素
    */
    @Test
    public void parse01() throws Exception {}

    /**
     2.相对路径： ./子元素/子元素。（.代表了当前元素）
     */
     @Test
     public void parse02() throws Exception {}
    
     /**
      3.全文搜索：
      // 元素 在全文找这个元素
      // 元素1/元素2 在全文找元素1下面的一级元素2
      // 元素1//元素2 在全文找元素1下面的全部元素2
      */
     @Test
     public void parse03() throws Exception {}

     /**
      4.属性查找
      // @属性名称 在全文检索属性对象
      // 元素[@属性名称] 在全文检索包含该属性的元素对象。
      // 元素[@属性名称=值] 在全文检索包含该属性的元素且属性值为该值的元素对象。
      */
     @Test
     public void parse04() throws Exception {}

}
