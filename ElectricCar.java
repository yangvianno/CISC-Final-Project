package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable {

    public ElectricCar(String manuName, int milesVehicle, int vehPrice, int numSeats, Option[] option, int numDoors) {
        super(manuName, milesVehicle, vehPrice, numSeats, option, numDoors);
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
}