package com.itheima.d3_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
    目标：完成出师表顺序的恢复，并存入到新文件去。
 */
public class BufferedCharTest03 {
    public static void main(String[] args) {
        try(
                // 1. 创建缓冲字符输入流与源文件接通。
//            BufferedReader bf = new BufferedReader(new FileReader("io-app2/src/csb.txt"));
                BufferedReader bf = new BufferedReader(new FileReader("io-app2/src/csb2.txt"));
                // 5. 定义缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(new FileWriter("io-app2/src/newCsb.txt") {
                });
                ) {
            // 2. 定义一个List集合存储每行数据
            List<String> data = new ArrayList<>();
            // 3. 循环读取每行数据
            String line;
            while ((line = bf.readLine()) != null){
                data.add(line);
            }
//            System.out.println(data);
            // 4. 排序
            // 自定义排序规则
            List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes, "一", "二",  "三", "四", "伍", "陆", "七", "八", "九");
            Collections.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    // o1
                    // o2
                    return sizes.indexOf(o1.substring(0, o1.indexOf("."))) - sizes.indexOf(o2.substring(0, o2.indexOf(".")));
                }
            });
//            System.out.println(data);
            // 6. 遍历集合中的每行文章写出去，且要换行
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("《出师表》回写成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
