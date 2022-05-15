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
        // 独有功能
        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.KeyDown();
        }else if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbClick();
        }

        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
