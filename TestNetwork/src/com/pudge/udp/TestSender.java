package com.pudge.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestSender {
    public static void main(String[] args) {
        System.out.println("student is online");
        try (DatagramSocket datagramSocket = new DatagramSocket(8888)) {
            String message = "你好";
            byte[] messageBytes = message.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(messageBytes, messageBytes.length, InetAddress.getByName("localhost"), 9999);
            datagramSocket.send(datagramPacket);
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket2 = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket2);
            System.out.println("from teacher" + new String(datagramPacket2.getData()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
