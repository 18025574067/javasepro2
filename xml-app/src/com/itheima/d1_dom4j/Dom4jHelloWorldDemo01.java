package com.itheima.d1_dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
    目标：学会使用dom4j解析XML文件中的数据
    1. 导入dom4j jar包。
    2. 准备一个XML文件。
    3.
 */
public class Dom4jHelloWorldDemo01 {
    @Test
    public void parseXMLDate() throws Exception {
        // 1. 创建一个dom4j解析器对象，代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
        // 2. 把XML文件加载到内存成为一个Document文档对象
//        Document document = saxReader.read(new File("xml-app/src/books.xml")); // 需要通过模块名去定位。
//        Document document = saxReader.read(new FileInputStream("xml-app/src/books.xml"));
        // 注意：只有去getResourceAsStream下的/才直接去src文件夹下找文件。
        InputStream inputStream = Dom4jHelloWorldDemo01.class.getResourceAsStream("/books.xml"); // 这样模块改名也没事。
        Document document = saxReader.read(inputStream);

        // 3. 获取根元素对象。
        Element element = document.getRootElement();
        System.out.println(element.getName());
    }

}
