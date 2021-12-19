package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible {

    public GasCar(String Name, int milesVehicle, int Price, int numSeats, Option[] option, int numDoors) {
        super(Name, milesVehicle, Price, numSeats, option, numDoors);
        numberOfDoors = numDoors;
    }
    public int getNumberOfDoors() {
        System.out.println(numberOfDoors);
        return numberOfDoors;
    }

    public int getFuelLevel() {
        System.out.println(fuelLevel);
        return fuelLevel;
    }
    public void tankUp() {
        fuelLevel = 100;
    }
}