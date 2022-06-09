package com.pudge.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        File file1 = new File("data_copy.txt");
        try (FileReader fileReader = new FileReader(file); FileWriter fileWriter = new FileWriter(file1)) {
            char[] chars = new char[5];
            int length;
            while ((length = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
