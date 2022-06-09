package com.pudge.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("hello world666");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
