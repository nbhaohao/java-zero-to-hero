package com.pudge.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) {
        File file = new File("avatar.jpeg");
        File file1 = new File("avatar_copy.jpeg");
        try (FileInputStream fileInputStream = new FileInputStream(file); FileOutputStream fileOutputStream = new FileOutputStream(file1)) {
            byte[] bytes = new byte[1024 * 6];
            int length = fileInputStream.read(bytes);
            while (length != -1) {
                fileOutputStream.write(bytes, 0, length);
                length = fileInputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
