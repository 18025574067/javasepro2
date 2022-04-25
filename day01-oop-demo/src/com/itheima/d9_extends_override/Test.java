package com.itheima.d9_extends_override;

/**
    案例演练：
    1. 旧手机可以打电话，发信息。
    2. 新手机要实现打电话的功能下支持视频功能，发信息的功能下支持发送语音和图片。

 */
public class Test {
    public static void main(String[] args) {
        // 目标：认识方法重写。
        NewPhone hw = new NewPhone();
        hw.call();
        hw.sendMsg();
    }
}

class NewPhone extends Phone{
    @Override // 重写方法校验，加上之后，这个方法必须是正确重写的，这样更安全。 2. 提高程序的可读性，代码优雅。
    public void call(){
        super.call();
        System.out.println("开始视频通话...");
    }

    @Override
    public void sendMsg(){
        super.sendMsg();
        System.out.println("发送有趣的图片...");
    }
}

/**
    旧手机：父类
 */
class Phone{
    public void call(){
        System.out.println("打电话～");
    }

    public void sendMsg(){
        System.out.println("发短信～");
    }
}