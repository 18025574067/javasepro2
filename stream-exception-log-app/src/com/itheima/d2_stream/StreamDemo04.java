package com.itheima.d2_stream;
/**
    1. 员工信息至少包含了（名称，性别，工资，处罚记录）
    2. 开发一部有4个员工，开发二部有5名员工
    3. 分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象topperformer
    4. 分别统计出2个部门的平均月收入，要求去掉最高和最低工资
    5. 统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值。
 */

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo04 {
    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 30000, 25000, null));
        one.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        one.add(new Employee("沙僧", '男', 20000, 20000, null));
        one.add(new Employee("小白龙", '男', 20000, 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松", '男', 15000, 9000, null));
        two.add(new Employee("李逵", '男', 20000, 10000, null));
        two.add(new Employee("西门庆", '男', 50000, 100000, "被打"));
        two.add(new Employee("潘金莲", '女', 3500, 1000, "被打"));
        two.add(new Employee("武大郎", '男', 20000, 0, "下毒"));

    }
}
