package com.itheima.d3_reflect_constructor;

/**
        1.newInstance(Object... instargs)
            创建对象，注入构造器需要的数据。
        2.void setAccessible(true)
            修改访问权限，true代表暴力攻破权限，false表示保留不可访问权限（暴力反射）

    小结：
        可以通过定位类的构造器对象。
        如果构造器对象没有访问权限可以通过：void seetAccessible(true)打开权限
        构造器可以通过T newInstance(Object... initargs)调用自己，传入参数！
*/
public class TestStudent02{
    // 1. 调用无参数构造器得到一个类的对象返回。


    // 2. 调用有参数构造器得到一个类的对象返回。


}

