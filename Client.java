package edu.sdccd.cisc191;

import java.net.*;
import java.io.*;

public class Client {

    public static void main(String[] args) {
        VehicleRequest newRequest;
        try {
            /*Initiate connect with server's port*/
            Socket clientSocket = new Socket("localhost", 4000);
            /*Get data*/
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
            /*Request the vehicle*/
            newRequest = new VehicleRequest(2017, "Honda", "Accord Sport");
            /*Transfer the request to output stream*/
            out.writeObject(newRequest);
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
            /*Get data from socket input stream*/
            VehicleResponse response = (VehicleResponse) in.readObject();
            System.out.println("This is a " + newRequest.getYear() + " " + newRequest.getMake() + " " + newRequest.getModel() + " with " + response.getMilesOnVehicle() + " miles " + "and the price is $" + response.getPrice() + ". " + "It can seat " + response.getNumberOfSeats()   + " people and has " + response.getNumberOfDoors() + " doors." );
            out.close();
            in.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}