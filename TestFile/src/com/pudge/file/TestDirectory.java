package com.pudge.file;

import java.io.File;

public class TestDirectory {
    public static void main(String[] args) {
        File file = new File("/Users/zhangzihao/zzh");
//        System.out.println(file.isDirectory());
//        System.out.println(file.exists());
//        if (!file.exists()) {
//            file.mkdir();
//        } else {
//            file.delete();
//        }
        File[] list = file.listFiles();
        for (File fileItem :
                list) {
            System.out.println(fileItem);
        }
    }
}
