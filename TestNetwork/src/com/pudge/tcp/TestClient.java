package com.pudge.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.3.32", 8888);
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream())) {
            dataOutputStream.writeUTF("你好");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
