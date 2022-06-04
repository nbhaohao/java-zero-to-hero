package com.pudge.test01;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr.length);
        int[] arr2 = null;
        // NullPointer
//        System.out.println(arr2.length);
        // ArrayIndexOutOfBoundsException
        System.out.println(arr[10]);
    }
}
