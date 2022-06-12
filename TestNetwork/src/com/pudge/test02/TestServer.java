package com.pudge.test02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

public class TestServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888);
             Socket socket = serverSocket.accept();
             ObjectInputStream dataInputStream = new ObjectInputStream(socket.getInputStream());
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream())) {
            boolean flag = false;
            User user = (User) dataInputStream.readObject();
            if (Objects.equals(user.getName(), "xx") && Objects.equals(user.getPassword(), "123")) {
                flag = true;
            }
            dataOutputStream.writeBoolean(flag);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
