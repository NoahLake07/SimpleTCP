package com.simpletcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

    public static void main(String[] args) {
        int port = 443; // Using port 443 for the server

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running on port " + port);

            // Get server's own details
            String serverAddress = InetAddress.getLocalHost().getHostAddress();
            System.out.println("Server address: " + serverAddress);

            // Wait for client connections
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress());

            // Perform any server-client communication here

            // Close the connections
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
