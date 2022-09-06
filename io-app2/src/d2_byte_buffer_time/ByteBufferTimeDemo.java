package d2_byte_buffer_time;

/**
        (2)使用低级的字节流按照一个一个字节数组的形式复制文件。
        (3)使用高级的缓冲字节流按照一个一个字节的形式复制文件。
        (4)使用高级的缓冲字节流按照一个一个字节数组的形式复制文件。

    源文件： C:\course\3-视频\18、IO流-文件字节输出流FileOutputStream写字节数据出去.avi
    目标文件：C:\course\

    小结：
        使用高级的缓冲字节流按照一个一个字节数组的形式复制文件、性能好、建议开发使用！

 */
public class ByteBufferTimeDemo {
    private static final String SRC_FILE = "D:\\course\\基础加强\\day08-日志框架\\视频\\14、用户购票功能.avi";
    private static final String DEST_FILE = "D:\\course\\";


    public static void main(String[] args) {
        // copy01(); // 使用低级的字节流按照一个一个字节的形式复制文件
        // copy02(); // 使用低级的字节流按照一个一个字节数组的形式复制文件
        // copy03(); // 缓冲流一个一个字节复制
        // copy04(); // 缓冲流一个一个字节数组复制

    }
}
















