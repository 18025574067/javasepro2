package com.itheima.d5_collection_list;

import java.util.LinkedList;

/**
    如果查询多而增删少则用ArrayList集合。
    如果查询少而增删多则用LinkedList集合。
 */
public class ListDemo3 {
    public static void main(String[] args) {
        // LinkedList集合可以完成队列结构和栈结构。

        // 栈: 先进后出

        // 压栈，入栈
        LinkedList<String> stack = new LinkedList<>();
//        stack.addFirst("第1颗子弹");
//        stack.addFirst("第2颗子弹");
//        stack.addFirst("第3颗子弹");
//        stack.addFirst("第4颗子弹");
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);

        // 出栈，弹栈
        System.out.println(stack.getFirst());
        System.out.println(stack);

//        System.out.println(stack.removeFirst());
//        System.out.println(stack.removeFirst());
//        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.removeFirst());

        System.out.println(stack);


        // 队列
        LinkedList<String> queue = new LinkedList<>();

        // 入队
//        queue.addLast("1号");
//        queue.addLast("2号");
//        queue.addLast("3号");
//        queue.addLast("4号");
        queue.offerLast("1号");
        queue.offerLast("2号");
        queue.offerLast("3号");
        queue.offerLast("4号");

        System.out.println(queue);

        // 出队
        System.out.println(queue.getFirst());
        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        System.out.println(queue);


    }
}
