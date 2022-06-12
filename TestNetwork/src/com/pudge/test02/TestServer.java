package com.pudge.test02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        System.out.println("服务器运行成功了");
        int count = 0;
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new ServerThread(socket)).start();
                System.out.println("当前是第" + count + "个用户访问我们的服务器，对应的用户是：" + socket.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
