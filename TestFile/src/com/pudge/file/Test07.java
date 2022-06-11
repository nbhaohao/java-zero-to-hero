package com.pudge.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) {
        File file = new File("avatar.jpeg");
        File file1 = new File("avatar_copy.jpeg");
        // 缓冲流将文件数据一次性加载，减少了对硬盘的访问次数
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1))) {
            byte[] bytes = new byte[1024 * 6];
            int length = bufferedInputStream.read(bytes);
            while (length != -1) {
                bufferedOutputStream.write(bytes, 0, length);
                length = bufferedInputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
