package com.itheima.d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
    目标：完成出师表顺序的恢复，并存入到新文件去。
 */
public class BufferedCharTest03 {
    public static void main(String[] args) {
        try {
            // 1. 创建缓冲字符输入流与源文件接通。
            BufferedReader bf = new BufferedReader(new FileReader("io-app2/src/csb.txt"));
            // 2. 定义一个List集合存储每行数据
            List<String> data = new ArrayList<>();
            // 3. 循环读取每行数据
            String line;
            while ((line = bf.readLine()) != null){
                data.add(line);
            }
            System.out.println(data);
            // 4. 排序
            Collections.sort(data);
            System.out.println(data);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
