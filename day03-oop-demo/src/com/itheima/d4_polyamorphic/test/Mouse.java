package com.itheima.d4_polyamorphic.test;

public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
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
    public void dbClick(){
        System.out.println(name + "双击点亮小红心，一键三连~~~~~~~~~~~~~~");
    }

    @Override
    public void connect() {
        System.out.println("成功地链接到电脑。。。。");
    }

    @Override
    public void unconnect() {
        System.out.println("成功从电脑拔出了。。。。");
    }
}

