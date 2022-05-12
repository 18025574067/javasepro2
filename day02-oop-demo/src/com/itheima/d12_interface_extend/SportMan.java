package com.itheima.d12_interface_extend;

/**
    一个接口可以多继承。
 */
public interface SportMan extends Law, People {
    void run();
    void competition();
}
