package edu.sdccd.cisc191;

public class Car extends Vehicle{

    public int numberOfDoors;
    public int fuelLevel;
    public int batteryCharge;

    public Car(String Name, int milesVehicle, int Price, int numSeats, Option[] option, int numDoors) {
        super(Name, milesVehicle, Price, numSeats, option);
        numberOfDoors = numDoors;
    }
    public int getNumberOfDoors() {
        System.out.println(numberOfDoors);
        return numberOfDoors;
    }
}