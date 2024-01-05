package com.simpletcp;

import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

public class ClientApp {

    public static void main(String[] args) {
        int port = 443; // Using port 443 to connect to the server

        try {
            String serverAddress = JOptionPane.showInputDialog("Enter server address:");

            // Connect to the server
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to server at " + serverAddress);

            // Perform any client-server communication here

            // Close the connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}