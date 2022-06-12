package com.pudge;

import java.net.InetSocketAddress;

public class TestSocket {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost", 8080);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getPort());
        System.out.println(inetSocketAddress.getAddress());
    }
}
