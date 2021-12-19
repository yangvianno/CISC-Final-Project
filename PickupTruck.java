package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle {

    public int cargoCapacity;

    public PickupTruck(String Name, int milesVehicle, int Price, int numSeats, Option[] option, int cargoCap) {
        super(Name, milesVehicle, Price, numSeats, option);
        cargoCapacity = cargoCap;
    }
    public int getCargoCapacity() {
        System.out.println(cargoCapacity);
        return cargoCapacity;
    }
}