package com.itheima.d9_proxy;

public class Star implements Skill {
    private String name;
    public Star(String name) {
        this.name = name;
    }
    
    @Override 
    public void jump() {
        System.out.println(name + "开始跳舞，跳得很迷人～～");
    }

    @Override
    public void sing() {
        System.out.println(name + "开始唱歌：我们都是小可爱，喵喵喵～～～");
    }


}
