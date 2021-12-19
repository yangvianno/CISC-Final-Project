package edu.sdccd.cisc191;

public class HybridCar extends Car implements Chargeable, Combustible {

    public HybridCar(String Name, int milesVehicle, int Price, int numSeats,
                     Option[] option, int numDoors) {
        super(Name, milesVehicle, Price, numSeats, option, numDoors);
        numberOfDoors = numDoors;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }

    @Override
    public int getBatteryCharge() {
        System.out.println(batteryCharge);
        return batteryCharge;
    }

    @Override
    public void tankUp() {
        fuelLevel = 100;
    }

    @Override
    public int getFuelLevel() {
        System.out.println(fuelLevel);
        return fuelLevel;
    }
}