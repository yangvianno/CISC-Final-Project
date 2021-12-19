package edu.sdccd.cisc191;

import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(4000);
        while (true) {
            /*Server getting connection*/
            Socket serverSocket = server.accept();
            /*Returns output stream*/
            ObjectOutputStream out = new ObjectOutputStream(serverSocket.getOutputStream());
            /*Returns input stream*/
            ObjectInputStream in = new ObjectInputStream(serverSocket.getInputStream());
            VehicleRequest request = (VehicleRequest) in.readObject();
            /*Get request and print data*/
            System.out.println("The requested vehicle is a " + request.getYear() + " " + request.getMake() + " " + request.getModel());
            Object vehicleResponse = new VehicleResponse(request, 28572, 23000, 5, 4, new String[]{"Sport Special Edition", "Roadwire leather"});
            out.writeObject(vehicleResponse);
            in.close();
            out.close();
            serverSocket.close();
        }
    }
}