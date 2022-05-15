package com.itheima.d4_polyamorphic.test;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    /**
        提供安装USB设备的入口
     */
    public void installUSB(USB usb){
        // 多态：父态作为接口入参，所有实现类都能进来
        // usb, 可能是鼠标，也可能是键盘。
        usb.connect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
