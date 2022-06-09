package com.pudge.file;

import java.io.FileReader;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("/Users/zhangzihao/zzh/test.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int n;
            while ((n = fileReader.read()) != -1) {
                stringBuilder.append((char) n);
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
