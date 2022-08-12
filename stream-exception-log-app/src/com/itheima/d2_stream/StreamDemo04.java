package com.itheima.d2_stream;
/**
    1. 员工信息至少包含了（名称，性别，工资，处罚记录）
    2. 开发一部有4个员工，开发二部有5名员工
    3. 分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象TopPerFormer
    4. 分别统计出2个部门的平均月收入，要求去掉最高和最低工资
    5. 统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值。
 */

import org.w3c.dom.stylesheets.LinkStyle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo04 {

    public static double allMoney;
    public static double allMoney2;
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

        // 1. 开发一部的最高工资员工
        // 指定大小规则。
        // Employee e = one.stream().max((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus())).get();
        // System.out.println(e);

        TopPerFormer t = one.stream().max((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus()))
                .map(e -> new TopPerFormer(e.getName(), e.getSalary() + e.getBonus())).get();
        System.out.println(t);

        // 2. 统计平均工资，去除最高和最低工资。
        one.stream().sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus()))
                .skip(1).limit(one.size()-2).forEach(e ->
                                // 求出总和，剩余员工和工资总和
                allMoney += e.getBonus() + e.getSalary()
                        );

        System.out.println("开发一部的平均工资是：" + allMoney / (one.size()-2));

        // 3. 合并2个集合流，再统计
        Stream<Employee> e1 = one.stream();
        Stream<Employee> e2 = two.stream();
        Stream<Employee> e3 = Stream.concat(e1, e2);
        e3.sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus()))
                .skip(1).limit(one.size() + two.size()-2).forEach(e ->
                        // 求出总和，剩余员工和工资总和
                        allMoney2 += e.getBonus() + e.getSalary()
                );

//        BigDecimal
        BigDecimal a = BigDecimal.valueOf(allMoney2);
        BigDecimal b = BigDecimal.valueOf((one.size() + two.size()-2));
        System.out.println("开发一部+二部的平均工资是：" + a.divide(b, 2, RoundingMode.HALF_UP));











    }
}
