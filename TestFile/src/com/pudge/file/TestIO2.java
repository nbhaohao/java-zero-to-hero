package com.pudge.file;

import java.io.FileReader;
import java.io.IOException;

public class TestIO2 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("/Users/zhangzihao/zzh/test.txt")) {
            char[] chars = new char[5];
            int length;
            StringBuilder stringBuilder = new StringBuilder();
            while ((length = fileReader.read(chars)) != -1) {
                for (int i = 0; i < length; i++) {
                    stringBuilder.append(chars[i]);
                }
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
