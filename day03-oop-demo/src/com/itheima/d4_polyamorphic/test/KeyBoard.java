package com.itheima.d4_polyamorphic.test;

/**
    实现类
 */
public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
        独有功能：打字
     */
    public void KeyDown(){
        System.out.println(name + "敲击了：来了，老铁，666~~~~~~，没毛病~~~~~");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功地链接到电脑。。。。");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑拔出了。。。。");
    }
}
