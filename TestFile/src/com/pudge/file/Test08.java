package com.pudge.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) {
        File file = new File("article.txt");
        File file1 = new File("article_copy.txt");
        // 缓冲流将文件数据一次性加载，减少了对硬盘的访问次数
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1))) {
            char[] chars = new char[1024 * 6];
            int length = bufferedReader.read(chars);
            while (length != -1) {
                bufferedWriter.write(chars, 0, length);
                length = bufferedReader.read(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
