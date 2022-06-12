package com.pudge.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888); Socket socket = serverSocket.accept();
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
            System.out.println(dataInputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
