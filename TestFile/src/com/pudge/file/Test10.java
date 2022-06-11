package com.pudge.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test10 {
    public static void main(String[] args) {
        File file = new File("out.txt");
        final InputStream inputStream = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String s;
            while ((s = bufferedReader.readLine()) != null && !s.equals("exit")) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
