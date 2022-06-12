package com.pudge.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestReceive {
    public static void main(String[] args) {
        System.out.println("teacher is online");
        try (DatagramSocket datagramSocket = new DatagramSocket(9999)) {
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData()));
            String message = "同学，你好";
            byte[] messageBytes = message.getBytes();
            DatagramPacket datagramPacket2 = new DatagramPacket(messageBytes, messageBytes.length, datagramPacket.getAddress(), datagramPacket.getPort());
            datagramSocket.send(datagramPacket2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
