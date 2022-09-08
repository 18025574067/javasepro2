package com.itheima.d4_transfer_stream;

import java.io.*;

/**
    public InputStreamReader(InputStream is):可以使用当前默认编码转换字符流，几乎不用。
    public InputStreamReader(InputStream is, String charset):可以使用指定编码反字节流转换字符流（核心）。
 小结：
     字符转换流InputStreamReader: 作用，可以解决字符流读取不同编码乱码的问题
     public InputStreamReader(InputStream is, String charset):可以使用指定编码反字节流转换字符流（核心）。
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) {
        try (
                // 代码UTF-8, 文件GBK
                InputStream is = new FileInputStream("io-app2/src/csb.txt") {
                };

                // a. 把低级的字符输入流转换成高级的缓冲字符输入流
//                Reader isr = new InputStreamReader(is); // 默认会以UTF-8的方式进行转换，会乱码，跟直接使用FileReader是一样的。
                Reader isr = new InputStreamReader(is, "GBK"); // 指定编码的方式进行转换，不会乱码。

                BufferedReader br = new BufferedReader(isr);
        ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
