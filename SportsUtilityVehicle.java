package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle {

    public int maxTowingWeight;

    public SportsUtilityVehicle(String Name, int milesVehicle, int Price, int numSeats, Option[] option, int maxTow) {
        super(Name, milesVehicle, Price, numSeats, option);
        maxTowingWeight = maxTow;
    }

    public int getMaxTowingWeight() {
        System.out.println(maxTowingWeight);
        return maxTowingWeight;
    }
}