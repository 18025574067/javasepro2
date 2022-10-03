package com.itheima.d4_reflect_field;
/**
    反射的第一步是先得到Class类对象。

    1.Field getField(String name);
        根据成员变量名获得对应Field对象，只能获得public修饰
    2.Field getDeclaredField(String name);
        根据成员变量名获得对应Field对象，只要申明了就可以得到
    3.Field[] getFields();
        获得所有的成员变量对应的Field对象，只能获得public的
    4.Field[] getDeclaredField();
        获得所有的成员变量对应的Field对象，只要申明了就可以得到
    小结：
        获取全部成员变量：getDeclaredFields
        获取某个成员变量：getDeclaredField
*/
public class FieldDemo01{
    /**
     * 1.获取全部的成员变量。
     */

}
