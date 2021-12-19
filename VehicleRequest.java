package edu.sdccd.cisc191;
import java.io.*;

public class VehicleRequest implements Serializable {
    private int year;
    private String make;
    private String model;

    public VehicleRequest (int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
 