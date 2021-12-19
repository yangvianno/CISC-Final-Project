package edu.sdccd.cisc191;

public class Vehicle {
    public String manufacturerName;
    public int milesOnVehicle;
    public int vehiclePrice;
    public int numberOfSeats;
    public Option[] options;

    public Vehicle(String Name, int milesVehicle, int Price, int numSeats, Option[] option) {
        manufacturerName = Name;
        milesOnVehicle = milesVehicle;
        vehiclePrice = Price;
        numberOfSeats = numSeats;
        options = option;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }
    public int getMilesOnVehicle() {
        System.out.println(milesOnVehicle);
        return milesOnVehicle;
    }
    public int getPrice() {
        System.out.println(vehiclePrice);
        return vehiclePrice;
    }
    public int getNumberOfSeats() {
        System.out.println(numberOfSeats);
        return numberOfSeats;
    }
    public Option[] getOptions() {
        System.out.println(options);
        return options;
    }
}