package com.example.client;

import com.example.MyServer;

public class MyClient {
    public static void main(String[] args) {
        System.out.println("Client was started");
        MyServer myServer = new MyServer();
        System.out.println("Server says" + myServer.sayHello());
    }
}
