package com.pudge.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test11 {
    public static void main(String[] args) {
        // can't read directly
        File file = new File("testData.txt");
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
            dataOutputStream.writeUTF("你好");
            dataOutputStream.writeUTF("你好");
            dataOutputStream.writeInt(5);
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}