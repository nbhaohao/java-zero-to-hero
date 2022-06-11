package com.pudge.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[1024 * 6];
            int length = fileInputStream.read(bytes);
            while (length != -1) {
                for (int i = 0; i < length; i++) {
                    System.out.println(bytes[i]);
                }
                length = fileInputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
