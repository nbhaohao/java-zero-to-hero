package com.pudge;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestAddress {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.3.32");
            InetAddress inetAddress1 = InetAddress.getByName("zzh.local");
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress);
            System.out.println(inetAddress1);
            System.out.println(inetAddress2.getHostName());
            System.out.println(inetAddress2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
