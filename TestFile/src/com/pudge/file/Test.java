package com.pudge.file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/zhangzihao/zzh/test.txt");
        File file2 = new File("/Users/zhangzihao/zzh/test.txt");
        File file23 = new File("test.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getParent());
        System.out.println(file == file2);
        System.out.println(file.equals(file2));
        System.out.println(file23.getAbsolutePath());
        System.out.println(file23.getPath());
    }
}
