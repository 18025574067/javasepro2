package com.itheima.d1_dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.List;

/**
    目标：学会使用dom4j解析XML文件中的数据
    1. 导入dom4j jar包。
    2. 准备一个XML文件。
    3.
 */
public class Dom4JHelloWorldDemo01 {
    @Test
    public void parseXMLDate() throws Exception {
        // 1. 创建一个dom4j解析器对象，代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
        // 2. 把XML文件加载到内存成为一个Document文档对象
//        Document document = saxReader.read(new File("xml-app/src/books.xml")); // 需要通过模块名去定位。
//        Document document = saxReader.read(new FileInputStream("xml-app/src/books.xml"));
        // 注意：只有getResourceAsStream直接去src文件夹下找文件。
//        InputStream inputStream = Dom4jHelloWorldDemo01.class.getResourceAsStream("/books.xml"); // 这样模块改名也没事。
        InputStream inputStream = Dom4JHelloWorldDemo01.class.getResourceAsStream("/Contacts2.xml"); // 这样模块改名也没事。
        Document document = saxReader.read(inputStream);

        // 3. 获取根元素对象。
        Element root = document.getRootElement();
        System.out.println(root.getName());

        // 4. 拿根元素下的全部子元素对象(一级)
//        List<Element> sonEles = root.elements();
        List<Element> sonEles = root.elements("contact");
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }

        // 拿某个子元素
        Element sonEle = root.element("user");
        System.out.println(sonEle.getName());

        // 默认只有提取第一个出现的元素。
        Element contact = root.element("contact");
        System.out.println(contact.elementText("name"));
        System.out.println(contact.elementTextTrim("name")); // 前后去空格

        // 根据无素取元素值
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName() + "==>" + idAttr.getValue());

        // 直接提取属性值
        System.out.println(contact.attributeValue("id"));
        System.out.println(contact.attributeValue("vip"));
        // 获取当前元素下的子元素对象
        Element email = contact.element("email");
        System.out.println(email.getText());

    }
}
