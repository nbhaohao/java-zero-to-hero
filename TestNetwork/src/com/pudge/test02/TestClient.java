package com.pudge.test02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;

class User implements Serializable {
    private static final long serialVersionUID = -7154730779525291329L;
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class TestClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.3.32", 8888);
             ObjectOutputStream dataOutputStream = new ObjectOutputStream(socket.getOutputStream());
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter your account：");
            String name = scanner.next();
            System.out.println("please enter your password：");
            String password = scanner.next();
            User user = new User(name, password);
            dataOutputStream.writeObject(user);
            boolean flag = dataInputStream.readBoolean();
            if (flag) {
                System.out.println("login success");
            } else {
                System.out.println("login fail");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
