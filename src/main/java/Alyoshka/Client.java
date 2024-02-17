package Alyoshka;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("localhost", Server.PORT);
             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            writer.println("New mini-tiny-programmer");
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
