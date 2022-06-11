package com.pudge.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Test09 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        File file2 = new File("data_copy.txt");
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2))) {
            char[] chars = new char[20];
            int readLength;
            while ((readLength = inputStreamReader.read(chars)) != -1) {
                outputStreamWriter.write(chars, 0, readLength);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
