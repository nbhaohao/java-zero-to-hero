package com.pudge.test02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Objects;

public class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
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
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
